package seeder;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.Ref;
import entity.Article;
import entity.Category;
import util.MyUtil;

import static com.googlecode.objectify.ObjectifyService.ofy;

public class ArticleSeeder {
    public static void  run(){
        Article article = Article.Builder.anArticle()
                .withTitle("China to hold illegal military drills in South China Sea amid rising tensions")
                .withUrl(MyUtil.getInstance().toSlug("China to hold illegal military drills in South China Sea amid rising tensions"))
                .withDescription("Hainan Province's Maritime Safety Administration announced Monday its plan to hold military drills near Vietnam's Paracel Islands on August 6-7.")
                .withContent("It said the first military training exercise will be held 9:30 a.m. to 11:30 a.m. and from 3 p.m. to 6 p.m. on Tuesday, August 6, and the second from 3 p.m. to 5 p.m. Wednesday. The exercise will be held in the vicinity of Vietnam’s Paracel (Hoang Sa) Islands in the East Sea, known internationally as the South China Sea.\n" +
                        "\n" +
                        "The administration said on its website that all vessels are forbidden from entering the area when the drills are underway.\n" +
                        "\n" +
                        "The military drills are being held even as the international community expresses concern over China's recent actions in the South China Sea.\n" +
                        "\n" +
                        "In particular, China sent oil survey ship Haiyang Dizhi 8 and its escorts to the southern area of Vietnam’s waters near the Vanguard Bank in early July, infringing upon Vietnam's exclusive economic zone and continental shelf.\n" +
                        "\n" +
                        "Vietnam's Deputy PM and Foreign Minister Pham Binh Minh voiced strong opposition to the Chinese operation at the recently held 52nd ASEAN Foreign Ministers' Meeting in Bangkok, Thailand. On the sidelines of the meeting, he told his Chinese counterpart Wang Yi that Vietnam and China need to maintain peace, stability and control conflicts well, without adding tensions and resolve disputes with peaceful measures.\n" +
                        "\n" +
                        "ASEAN foreign ministers and partners also stressed the importance of maintaining peace, stability, safety and freedom of navigation on the waterway, following international law and resolving issues through peaceful methods.\n" +
                        "\n" +
                        "Federica Mogherini, High Representative of the Union for Foreign Affairs and Security Policy and Vice President of the European Commission, expressed the EU's concern about the increasing tension in the South China Sea at a press conference in Hanoi Monday.\n" +
                        "\n" +
                        "\"The EU always supports measures to ease tensions and the need to respect international laws, including the 1982 United Nations Convention on the Law of the Sea (UNCLOS),\" she said.\n" +
                        "\n" +
                        "U.S. Secretary of State Mike Pompeo last Thursday added his voice to the international criticism, accusing China of coercing its Southeast Asian neighbors in disputes over the South China Sea. He urged regional allies to speak out against such actions.\n" +
                        "\n" +
                        "Vietnam's Foreign Ministry spokeswoman Le Thi Thu Hang had said earlier that Vietnam has contacted China on multiple occasions via different channels, delivered diplomatic notes to oppose China's violations and demanded that China withdraw its infringing ships from Vietnamese waters.\n" +
                        "\n" +
                        "Hang asserted that China has violated the spirit of the Declaration on the Conduct of Parties (DOC) in the South China Sea, complicated the situation in the waters and undermined negotiations on the South China Sea Code of Coduct between China and ASEAN.\n" +
                        "\n" +
                        "She reiterated that Vietnam has full legal grounds and historical evidence to assert its sovereignty over the Hoang Sa (Paracel) and Truong Sa (Spratly) archipelagoes in accordance with international law.\n" +
                        "\n" +
                        "Experts have said China is trying to turn Vietnamese territory into a disputed area to advance its superpower plans, but that the actions could erode bilateral and regional trust and affect domestic opinion.\n" +
                        "\n" +
                        "China seized the Paracel Islands from South Vietnam by force in 1974, and has been illegally occupying a number of reefs in the Spratly Islands since 1988.\n" +
                        "\n" +
                        "China claims almost the entire South China Sea, including waters close to Taiwan and Southeast Asian countries Brunei, Indonesia, Malaysia, the Philippines and Vietnam.\n" +
                        "\n" +
                        "Last June, China conducted a series of anti-ship ballistic missile tests in an area to the north of the Spratly  Islands from June 29 until July 3.")
                .withCategory(Ref.create(Key.create(Category.class, Long.parseLong("1565101635156"))))
                .withThumbnail("https://i-english.vnecdn.net/2019/08/05/woody1553783565155378363174801-1445-1343-1564999849_680x408.jpg")
                .build();
        ofy().save().entity(article).now();
//
        article = Article.Builder.anArticle()
                .withTitle("Chinese giant becomes biggest shareholder in e-commerce platform Tiki")
                .withUrl(MyUtil.getInstance().toSlug("Chinese giant becomes biggest shareholder in e-commerce platform Tiki"))
                .withDescription("China’s JD.com has overtaken gaming firm VNG Corp to become the largest shareholder of leading Vietnamese e-commerce platform Tiki.")
                .withContent("Companies\n" +
                        "\n" +
                        "Chinese giant becomes biggest shareholder in e-commerce platform Tiki\n" +
                        "By Minh Son   August 5, 2019 | 05:11 pm GMT+7\n" +
                        "Chinese giant becomes biggest shareholder in e-commerce platform Tiki\n" +
                        "The Tiki shopping app on a smartphone screen. Photo by Shutterstock/bangoland.\n" +
                        "China’s JD.com has overtaken gaming firm VNG Corp to become the largest shareholder of leading Vietnamese e-commerce platform Tiki.\n" +
                        "As of June 30, VNG's ownership in Tiki has fallen to 24.4 percent from 28.8 percent at the beginning of the year, according to the Vietnamese gaming firm’s latest semi-annual financial report.\n" +
                        "\n" +
                        "Having made two investments in the first half of the year, JD.com, China’s second-biggest e-commerce firm behind Alibaba, has raised its stake in Tiki to 25.65 percent.\n" +
                        "\n" +
                        "JD.com has not disclosed how much it has newly invested in Tiki to become its largest shareholder." +
                        "VNG had been the biggest shareholder in Tiki after buying a 38 percent stake in the company in May 2016, in return for investing $17 million in the then startup. \n" +
                        "\n" +
                        "However, Tiki reported losses totaling VND380 billion ($16.42 million) in 2016 and 2017. As the e-commerce market heated up with increasing competition from Lazada and Shopee, Tiki decided to receive a $44 million investment from JD.com for an undisclosed stake.\n" +
                        "\n" +
                        "JD.com’s stake in Tiki was revealed at 22 percent in January 2018, when VNG invested an additional VND120 billion ($5.19 million) to maintain its majority shareholder status at 28.8 percent.\n" +
                        "\n" +
                        "However, the very same month, JD.com followed up with another undisclosed investment. JD.com had told Reuters then that it had become Tiki’s largest shareholders alongside VNG following the deal.\n" +
                        "\n" +
                        "Tiki, founded in 2010 in Ho Chi Minh City, started with selling books online, then expanded its business to include a wide variety of consumer products.\n" +
                        "\n" +
                        "The online marketplace was the second most visited in Vietnam in the first half of 2019, with 33.7 million web visits per month, behind Singapore-based Shopee which had 38.6 million.")
                .withThumbnail("https://i-english.vnecdn.net/2019/08/05/Tiki-1564999676-1111-1564999849_680x408.jpg")
                .withCategory(Ref.create(Key.create(Category.class, Long.parseLong("1565101635727"))))
                .build();
        ofy().save().entity(article).now();
//
        article = Article.Builder.anArticle()
                .withTitle("Hanoi earns highest tourism revenue in four years")
                .withUrl(MyUtil.getInstance().toSlug("Hanoi earns highest tourism revenue in four years"))
                .withDescription("The capital city posted its highest January-July tourism revenues in four years at VND57.7 trillion ($2.4 billion)")
                .withContent("Hanoi received a record 16.75 million tourists in the first seven months of the year, up 9.2 percent from a year ago. Of these, foreign arrivals reached 3.7 million, an 8.9 percent increase.\n" +
                        "\n" +
                        "The robust growth in arrivals helped expand tourism revenues by 28.8 year-on-year to VND57.7 trillion, the highest in four years, according to the city’s Department of Tourism.\n" +
                        "\n" +
                        "Hanoi currently has 3,499 lodging facilities including hotels, condo-hotels, and hostels with a total of 60,812 rooms. The number of stay-over foreign tourists in the city amounted to around 2.6 million in the first seven months of the year, up 6.2 percent, mainly from South Korea, China and Japan. the department said.\n" +
                        "\n" +
                        "A series of major tourism events since early this year have put the capital in the international spotlight, one of them being the historic second summit between U.S. President Donald Trump and North Korean leader Kim Jong-un last February.\n" +
                        "\n" +
                        "Last month, Hanoi celebrated 20 years of it being granted the \"City for Peace\" title by UNESCO, recognizing its contributions to the struggle for peace, its efforts to promote equality in the community, protect the environment, promote culture and education and care for younger generations.\n" +
                        "\n" +
                        "Over the past years, Hanoi has increased efforts to give the local tourism industry a boost and make the capital a leading tourism destination in Southeast Asia.\n" +
                        "\n" +
                        "In 2016, Hanoi allowed restaurants and bars in the central district of Hoan Kiem to remain open until 2 a.m. from Friday to Sunday, boosting its nightlife appeal. It also opened a pedestrian-exclusive zone around the iconic Hoan Kiem (Sword) Lake during the weekends and installed free public wi-fi hot spots in many outdoor spaces and street corners.\n" +
                        "\n" +
                        "2018 was a successful year for Hanoi’s tourism sector with a record high 5.74 million foreign visitors, up 16 percent year-on-year. A survey by its tourism department found foreign visitors spent $92-114 a day on average last year.\n" +
                        "\n" +
                        "Hanoi officials last April signed a memorandum of understanding with CNN to continue its tourism promotion campaign on social media and to air documentaries on the popular cable news network in the 2019-2024 period.\n" +
                        "\n" +
                        "Saigon and Hanoi were among the world’s 100 most visited travel destinations in 2018, a Euromonitor International report said.\n" +
                        "\n" +
                        "The capital city was named among the top 15 destinations in the world by TripAdvisor travelers.\n" +
                        "\n" +
                        "The city is also on top of the list of most affordable destinations in the world, with backpackers needing just $18.29 a day in Hanoi, according to the 2019 Backpacker Index formulated by Price of Travel, the world’s largest database of travel costs.")
                .withThumbnail("https://i-english.vnecdn.net/2019/08/02/shutterstock526152628154106275-6242-1538-1564741394_680x408.jpg")
                .withCategory(Ref.create(Key.create(Category.class,Long.parseLong("1565101635729"))))
                .build();
        ofy().save().entity(article).now();
//
        article = Article.Builder.anArticle()
                .withTitle("Quang Nam house opens up to nature")
                .withUrl(MyUtil.getInstance().toSlug("Quang Nam house opens up to nature"))
                .withDescription("A house in the central province of Quang Nam eschews walls to blur the distinction between indoors and outdoors")
                .withContent("The three-story house was built on a 147-square meter plot of land belongs to a young couple in the province. They use it for their homestay service. It only 200 meters from the beautiful An Bang beach, and has green, tranquil surroundings.")
                .withThumbnail("https://i-english.vnecdn.net/2019/08/05/a-147-1564711443-680x0-8948-1564976636.jpg")
                .withCategory(Ref.create(Key.create(Category.class, Long.parseLong("1565101635731"))))
                .build();
        ofy().save().entity(article).now();
//
        article = Article.Builder.anArticle()
                .withTitle("Police officers rush to save football fan during V. League game")
                .withUrl(MyUtil.getInstance().toSlug("Police officers rush to save football fan during V. League game"))
                .withDescription("A boy fainted at a crowded V. League match in the northern Nam Dinh Province Sunday, and cops promptly rushed him to medical staff.")
                .withContent("It was a sold out match between Nam Dinh FC and Hoang Anh Gia Lai, with 25,000 fans filling up the seats at the Thien Truong Stadium.\n" +
                        "\n" +
                        "The crowded and hot atmosphere caused a lack of air on the stands, causing a small boy to faint and have seizures.\n" +
                        "\n" +
                        "Mobile police officer Tran Duc Giang and his colleagues spotted the situation and were quick to respond. They got the boy out of the crowd.\n" +
                        "\n" +
                        "Giang also put his hand in the boy's mouth to prevent him from choking on his tongue or biting his tongue and took him to the ambulance.")
                .withThumbnail("https://i-english.vnecdn.net/2019/08/05/cop-1564986565-6612-1564986792_680x408.jpg")
                .withCategory(Ref.create(Key.create(Category.class, Long.parseLong("1565101635735"))))
                .build();
        ofy().save().entity(article).now();
//
        article = Article.Builder.anArticle()
                .withTitle("Sidewalks and traffic: a false trade-off")
                .withUrl(MyUtil.getInstance().toSlug("Sidewalks and traffic: a false trade-off"))
                .withDescription("When I was writing my book \"Hanoi Promenade,\" I often wondered what makes the city so special, so attaching.")
                .withContent("Livability rankings for cities are often based on criteria such as quality schools, or clean air, or low crime... But I always thought that there was something else about Hanoi, something more difficult to measure. If I had to put a name on that something it would be \"lively sidewalks.\"\n" +
                        "\n" +
                        "I am sure that many of the tourists who visit Hanoi would agree with me. And the Hanoians who buy their vegetables in street markets in the morning, take their children and pets out for a walk during the day, or get together to eat, drink and date outdoors in the evening, would also agree.\n" +
                        "\n" +
                        "There are many reasons why sidewalks are so full of life in Hanoi. The French urban layout of the city center includes beautiful tree-lined streets, with ample space for pedestrians. Crowded housing encourages people to go out. And Vietnamese food is so good that nobody wants to miss on the chance of a street pho in the morning, or a street bun cha at night.\n" +
                        "\n" +
                        "For all these reasons, I feel truly heartened to see the urban authorities of Hanoi planting so many trees throughout the city, following the tradition of the old French urban layout. I am also reassured that informal markets, food stalls, friendship and love continue to thrive on Hanoi’s sidewalks, despite the declared intention to make them \"neat.\"\n" +
                        "\n" +
                        "However, there are also times when I get worried. Recently, Nghi Tam road was upgraded, in a way that helps traffic flow. And that makes perfect sense. But in the process the sidewalks were narrowed to the bare minimum, and all trees were removed. I understand that Au Co road may soon suffer the same fate.\n" +
                        "\n" +
                        "Nghi Tam and Au Co road are one of the main axes to travel from the airport to the city center. They are the first image of Hanoi that will welcome heads of state and other important personalities visiting Vietnam. Their narrow and sterile sidewalks, without a tree, will produce a sad first impression.\n" +
                        "\n" +
                        "The justification to cull trees, narrow sidewalks and widen streets is understandable: there are too many vehicles on the road, and traffic congestion is becoming unbearable. If road surface increases, traffic will flow more smoothly, and congestion will be eased.")
                .withThumbnail("https://i-english.vnecdn.net/2019/07/25/Hanoi2-5303-1564048069.jpg")
                .withCategory(Ref.create(Key.create(Category.class, Long.parseLong("1565101635735"))))
                .build();
        ofy().save().entity(article).now();
    }
}
