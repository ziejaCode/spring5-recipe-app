package guru.springframework.services;

import guru.springframework.domain.Recipe;
import guru.springframework.repositories.RecipeRepository;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.mockito.Mockito.*;

public class RecipeServiceImplTest extends TestCase {

    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @Before
    public void setUp() throws Exception{
        MockitoAnnotations.initMocks(this);
        recipeService = new RecipeServiceImpl(recipeRepository);
    }
    @Test
    public void testGetRecipes() {

        Recipe recipe1 = new Recipe();
        HashSet<Recipe>recipeDate = new HashSet<>();
        recipeDate.add(recipe1);

        System.out.println("size is :" + recipeDate.size());
        when(recipeService.getRecipes()).thenReturn(recipeDate);

        Set<Recipe> recipes = recipeService.getRecipes();

        System.out.println("size is :" + recipes.size());

        assertEquals(recipes.size(), 1);
        verify(recipeRepository, times(2)).findAll();
    }
}