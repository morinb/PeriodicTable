package com.github.morinb.periodic;

import com.github.morinb.periodic.dtos.Category;
import com.github.morinb.periodic.dtos.Element;
import com.github.morinb.periodic.dtos.Group;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

/**
 * @author Baptiste MORIN
 */
@SpringBootApplication
public class Application implements CommandLineRunner {
    private static
    final Logger LOG = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    private EntityManager em;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        LOG.info("Creating sample datas ...");

        //region Groups
        LOG.info("Creating groups ...");

        final Group g1 = Group.create(em, 1, "Alkali metal");

        final Group g2 = Group.create(em, 2, "Alkali earth metal");

        final Group g3 = Group.create(em, 3, null);

        final Group g4 = Group.create(em, 4, null);

        final Group g5 = Group.create(em, 5, null);

        final Group g6 = Group.create(em, 6, null);

        final Group g7 = Group.create(em, 7, null);

        final Group g8 = Group.create(em, 8, null);

        final Group g9 = Group.create(em, 9, null);

        final Group g10 = Group.create(em, 10, null);

        final Group g11 = Group.create(em, 11, "coinage metal");

        final Group g12 = Group.create(em, 12, "volatile metal");

        final Group g13 = Group.create(em, 13, "triel, icosagen");

        final Group g14 = Group.create(em, 14, "tetrel, crystallogen");

        final Group g15 = Group.create(em, 15, "pnictogen");

        final Group g16 = Group.create(em, 16, "chalcogen");

        final Group g17 = Group.create(em, 17, "halogen");

        final Group g18 = Group.create(em, 18, "noble gases, aerogen");

        LOG.info("Groups created");
        //endregion

        //endregion
        //region Categories
        LOG.info("Creating Categories");
        int index = 0;

        final Category diatomicNonMetal = Category.create(em, index++, "diatomic nonmetal");

        final Category nobleGases = Category.create(em, index++, "noble gases");

        final Category alkaliMetals = Category.create(em, index++, "alkali metal");

        final Category alkalineEarthMetals = Category.create(em, index++, "alkaline earth metal");

        final Category metalloid = Category.create(em, index++, "metalloid");

        final Category polyatomicMetalloid = Category.create(em, index++, "polyatomic metalloid");

        final Category postTransitionMetal = Category.create(em, index++, "post-transition metal");

        final Category transitionMetal = Category.create(em, index++, "transition metal");

        final Category lanthanide = Category.create(em, index++, "lanthanide");

        final Category actinide = Category.create(em, index++, "actinide");

        final Category unknown = Category.create(em, index++, "unknown");


        LOG.info("Categories created");
        //endregion


        //region Elements
        LOG.info("Creating elements ...");

        final String gas = "gas";

        final char blockS = 'S';

        final Integer p1 = 1;


        Element hydrogen = Element.create(em, 1, "Hydrogen", "H", 1.008, g1, blockS, p1, diatomicNonMetal,
                gas, 0.08988, 13.99, 20.271, 0.117, 0.904, 28.836, "hydrogen");

        System.out.println(hydrogen);

        LOG.info("Elements created");

        //endregion

        LOG.info("Sample datas created");
    }

    @SuppressWarnings("unchecked")
    private <T> List<T> fetch(Class<T> clazz, String queryName) {
        return em.createNamedQuery(queryName, clazz).getResultList();
    }
}
