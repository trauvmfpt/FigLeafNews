package seeder;

import entity.Category;
import util.MyUtil;

import static com.googlecode.objectify.ObjectifyService.ofy;

// Run by TestController
//Remember run one time
public class CategorySeeder {
    public static void run(){
        Category category = Category.Builder.aCategory()
                .withId(Long.parseLong("1565199945149"))
                .withName("News")
                .withDescription("Newest news")
                .withUrl(MyUtil.getInstance().toSlug("News"))
                .build();
        ofy().save().entity(category).now();
        category = Category.Builder.aCategory()
                .withId(Long.parseLong("1565199945602"))
                .withName("Business")
                .withDescription("Business news")
                .withUrl(MyUtil.getInstance().toSlug("Business"))
                .build();
        ofy().save().entity(category).now();
        category = Category.Builder.aCategory()
                .withId(Long.parseLong("1565199945604"))
                .withName("Life")
                .withDescription("Life news")
                .withUrl(MyUtil.getInstance().toSlug("Life"))
                .build();
        ofy().save().entity(category).now();
        category = Category.Builder.aCategory()
                .withId(Long.parseLong("1565199945606"))
                .withName("Sports")
                .withDescription("Sports news")
                .withUrl(MyUtil.getInstance().toSlug("Sports"))
                .build();
        ofy().save().entity(category).now();
        category = Category.Builder.aCategory()
                .withId(Long.parseLong("1565199945609"))
                .withName("Perspectives")
                .withDescription("Perspectives news")
                .withUrl(MyUtil.getInstance().toSlug("Perspectives"))
                .build();
        ofy().save().entity(category).now();
    }

}
