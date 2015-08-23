package com.github.morinb.periodic.dtos;

import javax.persistence.*;

/**
 * @author Baptiste MORIN
 */
@Entity
@Table(name = "element", schema = "elements")
public class Element {
    @Id
    private Integer atomicNumber;
    private String name;
    private String symbol;
    private Double atomicWeight;

    @ManyToOne
    private Group group;

    private Character block;
    private Integer period;
    @ManyToOne
    private Category category;

    private String phase;
    private Double density;

    private Double meltingPointInKelvin;
    private Double boilingPointInKelvin;
    private Double heatOfFusion;
    private Double heatOfVaporization;
    private Double molarHeatCapacity;

    private String pictureName;

    public Element() {
    }

    public Element(Integer atomicNumber, String name, String symbol, Double atomicWeight,
                   Group group, Character block, Integer period, Category category,
                   String phase, Double density, Double meltingPointInKelvin,
                   Double boilingPointInKelvin, Double heatOfFusion, Double heatOfVaporization,
                   Double molarHeatCapacity, String pictureName) {
        this.atomicNumber = atomicNumber;
        this.name = name;
        this.symbol = symbol;
        this.atomicWeight = atomicWeight;
        this.group = group;
        this.block = block;
        this.period = period;
        this.category = category;
        this.phase = phase;
        this.density = density;
        this.meltingPointInKelvin = meltingPointInKelvin;
        this.boilingPointInKelvin = boilingPointInKelvin;
        this.heatOfFusion = heatOfFusion;
        this.heatOfVaporization = heatOfVaporization;
        this.molarHeatCapacity = molarHeatCapacity;
        this.pictureName = pictureName;
    }

    public Integer getAtomicNumber() {
        return atomicNumber;
    }

    public void setAtomicNumber(Integer atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Double getAtomicWeight() {
        return atomicWeight;
    }

    public void setAtomicWeight(Double atomicWeight) {
        this.atomicWeight = atomicWeight;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Character getBlock() {
        return block;
    }

    public void setBlock(Character block) {
        this.block = block;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public Double getDensity() {
        return density;
    }

    public void setDensity(Double density) {
        this.density = density;
    }

    public Double getMeltingPointInKelvin() {
        return meltingPointInKelvin;
    }

    public void setMeltingPointInKelvin(Double meltingPointInKelvin) {
        this.meltingPointInKelvin = meltingPointInKelvin;
    }

    public Double getBoilingPointInKelvin() {
        return boilingPointInKelvin;
    }

    public void setBoilingPointInKelvin(Double boilingPointInKelvin) {
        this.boilingPointInKelvin = boilingPointInKelvin;
    }

    public Double getHeatOfFusion() {
        return heatOfFusion;
    }

    public void setHeatOfFusion(Double heatOfFusion) {
        this.heatOfFusion = heatOfFusion;
    }

    public Double getHeatOfVaporization() {
        return heatOfVaporization;
    }

    public void setHeatOfVaporization(Double heatOfVaporization) {
        this.heatOfVaporization = heatOfVaporization;
    }

    public Double getMolarHeatCapacity() {
        return molarHeatCapacity;
    }

    public void setMolarHeatCapacity(Double molarHeatCapacity) {
        this.molarHeatCapacity = molarHeatCapacity;
    }

    public String getPictureName() {
        return pictureName;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
    }


    public static Element create(EntityManager em, Integer atomicNumber, String name, String symbol,
                                 Double atomicWeight, Group group, Character block, Integer period,
                                 Category category, String phase, Double density,
                                 Double meltingPointInKelvin, Double boilingPointInKelvin,
                                 Double heatOfFusion, Double heatOfVaporization,
                                 Double molarHeatCapacity, String pictureName) {
        Element element = em.find(Element.class, atomicNumber);
        if (element == null) {
            element = new Element(atomicNumber, name, symbol, atomicWeight, group, block, period,
                    category, phase, density, meltingPointInKelvin, boilingPointInKelvin,
                    heatOfFusion, heatOfVaporization, molarHeatCapacity, pictureName);
            em.persist(element);
            element = em.find(Element.class, atomicNumber);
        }

        return element;
    }

    @Override
    public String toString() {
        return "Element{" +
                "atomicNumber=" + atomicNumber +
                ", name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", atomicWeight=" + atomicWeight +
                ", group=" + group +
                ", block=" + block +
                ", period=" + period +
                ", category=" + category +
                ", phase='" + phase + '\'' +
                ", density=" + density + " g/L" +
                ", meltingPointInKelvin=" + meltingPointInKelvin + " K" +
                ", boilingPointInKelvin=" + boilingPointInKelvin + " K" +
                ", heatOfFusion=" + heatOfFusion + " kJ/mol" +
                ", heatOfVaporization=" + heatOfVaporization + " kJ/mol" +
                ", molarHeatCapacity=" + molarHeatCapacity + " J/(mol.K)" +
                ", pictureName='" + pictureName + '\'' +
                '}';
    }
}
