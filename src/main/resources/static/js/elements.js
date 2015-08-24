(function () {
    'use strict';


    angular.module('element', []).controller('ElementController', function () {
        this.pelements = [
            {
                "x": 1,
                "y": 1,
                "name": "Hydrogen",
                "symbol": "H",
                "atomic_number": 1,
                "atomic_mass": 1.00794,
                "state": "gas",
                "color": null,
                "classification": "Non-metallic",
                "group": 1,
                "group_name": "none",
                "period": 1,
                "block": 's',
                "electron_shell": "1s1",
                "discovery": 1766,
                "electronegativity": {
                    "pauling": 2.20,
                    "sanderson": 2.59,
                    "allerd_rochow": 2.20,
                    "mulliken-jaffe": 2.25,
                    "allen": 2.300
                },
                "physics": {
                    "density_properties": {
                        "density": 88,
                        "molar_volume": 11.42
                    },
                    "elastic_properties": {
                        "young_modulus": null,
                        "rigidity_modulus": null,
                        "bulk_modulus": null,
                        "poisson_modulus": null
                    },
                    "hardness": {
                        "mineral_hardness": null,
                        "brinell_hardness": null,
                        "vickers_hardness": null
                    },
                    "electrical_properties": {
                        "electrical_resistivity": null
                    },
                    "heat_and_conduction": {
                        "thermal_conductivity": 0.1805,
                        "coefficient_of_linear_thermal_expansion": null
                    },
                    "optical_properties": {
                        "reflectivity": null,
                        "refractive_index": 1.000132
                    },
                    "acoustic_properties": {
                        "velocity_of_sound": 1270
                    }
                },
                "radius": {
                    "empirical": 25,
                    "calculated": 53,
                    "covalent_2008": 31,
                    "molecular_single_bond": 32,
                    "molecular_double_bond": null,
                    "molecular_triple_bond": null,
                    "covalent_empirical": 37,
                    "van_der_waals": 120
                },
                "thermodynamics": {
                    "melting_point": 14.01,
                    "boiling_point": 20.28,
                    "liquid_range": 6.27,
                    "critical_temperature": 33,
                    "superconduction_temperature": null
                }
            },
            {
                "x": 0,
                "y": 0,
                "name": "Helium",
                "symbol": "He",
                "atomic_number": 0,
                "atomic_mass": 0,
                "state": 0,
                "color": 0,
                "classification": 0,
                "group": 0,
                "group_name": 0,
                "period": 0,
                "block": 0,
                "electron_shell": 0,
                "discovery": 1766,
                "electronegativity": {
                    "pauling": 0,
                    "sanderson": 0,
                    "allerd_rochow": 0,
                    "mulliken-jaffe": 0,
                    "allen": 0
                },
                "physics": {
                    "density_properties": {
                        "density": 0,
                        "molar_volume": 0
                    },
                    "elastic_properties": {
                        "young_modulus": null,
                        "rigidity_modulus": null,
                        "bulk_modulus": null,
                        "poisson_modulus": null
                    },
                    "hardness": {
                        "mineral_hardness": null,
                        "brinell_hardness": null,
                        "vickers_hardness": null
                    },
                    "electrical_properties": {
                        "electrical_resistivity": null
                    },
                    "heat_and_conduction": {
                        "thermal_conductivity": 0,
                        "coefficient_of_linear_thermal_expansion": 0
                    },
                    "optical_properties": {
                        "reflectivity": 0,
                        "refractive_index": 0
                    },
                    "acoustic_properties": {
                        "velocity_of_sound": 0
                    }
                },
                "radius": {
                    "empirical": 0,
                    "calculated": 0,
                    "covalent_2008": 0,
                    "molecular_single_bond": 0,
                    "molecular_double_bond": 0,
                    "molecular_triple_bond": 0,
                    "covalent_empirical": 0,
                    "van_der_waals": 0
                },
                "thermodynamics": {
                    "melting_point": 0,
                    "boiling_point": 0,
                    "liquid_range": 0,
                    "critical_temperature": 0,
                    "superconduction_temperature": 0
                }

            }
        ];
    });



})();