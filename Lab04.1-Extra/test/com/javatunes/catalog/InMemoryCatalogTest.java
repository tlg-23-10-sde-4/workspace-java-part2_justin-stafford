/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.javatunes.catalog;

import com.javatunes.catalog.InMemoryCatalog;
import com.javatunes.catalog.MusicCategory;
import com.javatunes.catalog.MusicItem;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


import java.util.Collection;

public class InMemoryCatalogTest {
    private InMemoryCatalog catalog;

    /*
     * One by one, complete each test method below, and then "activate" it by
     * uncommenting the call to that method in main().
     *
     * Once you see that the test method verifies the corresponding business method
     * works correctly, you can comment out that call in main() and proceed to the next one.
     */
    public static void main(String[] args) {
        // TODO
        //testFindById();  //complete
        //testFindByKeyword();  //complete
        //testFindByCategory();  //complete
        //testSize();  //complete
        testGetAll();
        
        // TASK complete tests
//        testFindSelfTitled();
//        testFindCheapRock();
//        testNumberInGenre();
//        testAveragePrice();
//        testFindCheapest();
    }

    @Before
    public void setUp()  {
        catalog = new InMemoryCatalog();
    }

    @Test
    public void findSelfTitled_shouldReturnCollection_withArtist() {
    }

    @Test
    public void findByCategory_shouldReturnCollection_categoryFound() {
        Collection<MusicItem> items = catalog.findByCategory(MusicCategory.POP);
        
        assertEquals(4, items.size());
        for (MusicItem item : items) {
            assertTrue(MusicCategory.POP == item.getMusicCategory());
            assertSame(MusicCategory.POP, item.getMusicCategory());
        }
    }

    @Test
    public void findSelfTitled_shouldReturnCollection_withArtistSameAsTitle() {
        Collection<MusicItem> items = catalog.findSelfTitled();

        for (MusicItem item : items) {
            assertTrue(item.getTitle().equals(item.getArtist()));
        }
    }

    @Test
    public void findById_shouldReturnMusicItem_idFound() {
        MusicItem item = catalog.findById(1L);

        assertNotNull(item);
        assertEquals(1L, item.getId().longValue());  // TODO: follow-up on how to use longValue
    }

    @Test
    public void findByID_shouldReturnNull_idNotFound() {
        MusicItem item = catalog.findById(19L);

        assertNull(item);
        assertTrue(item == null);

    }


    private static void testFindById() {
        InMemoryCatalog catalog = new InMemoryCatalog();

        MusicItem found = catalog.findById(9L);
        System.out.println(found);

        MusicItem notFound = catalog.findById(100L);
        System.out.println(notFound);
    }

    private static void testFindByKeyword() {
        InMemoryCatalog catalog = new InMemoryCatalog();

        Collection<MusicItem> rockItems = catalog.findByKeyword("Seal");
        dump(rockItems);
    }

    private static void testFindByCategory() {
        InMemoryCatalog catalog = new InMemoryCatalog();

        Collection<MusicItem> popItems = catalog.findByCategory(MusicCategory.POP);
        dump(popItems);
    }

    private static void testSize() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        System.out.println(catalog.size()); // should be 18 - Complete
    }

    private static void testGetAll() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        Collection<MusicItem> allItems = catalog.getAll();
        allItems.clear();  // should throw exception
        // dump(allItems);

    }

    private static void testFindSelfTitled() {
    }

    private static void testFindCheapRock() {

    }
    private static void testNumberInGenre() {
    }

    private static void testAveragePrice() {
    }

    private static void testFindCheapest() {

    }



    // helper method to show the collection "vertically"
    private static void dump(Collection<MusicItem> items) {
        for (MusicItem item : items) {
            System.out.println(item);
        }
    }


}