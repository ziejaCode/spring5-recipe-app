package guru.springframework.domain;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class CategoryTest extends TestCase {

    Category category;

    @Before
    public void setUp() throws Exception {
        category = new Category();
    }
    @Test
    public void testGetId() {
        Long idValue = 4L;
        category.setId(idValue);
        assertEquals(idValue, category.getId());
    }
    @Test
    public void testGetDescription() {
    }

    @Test
    public void testGetRecipes() {
    }
}