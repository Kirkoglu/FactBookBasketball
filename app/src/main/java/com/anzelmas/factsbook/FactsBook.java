package com.anzelmas.factsbook;

import java.util.Random;

public class FactsBook {

    // Saugomi visi facts
    String[] facts = {
            "James Naismith, a teacher at a YMCA in Springfield, Massachusetts, is credited with inventing basketball in 1891.",
            "The first “hoops” were actually just peach baskets and the first backboards were made of wire.",
            "The game became an official Olympic event at the Summer Games in Berlin, Germany in 1936.",
            "Two leagues called the National Basketball League (NBL) and the Basketball Association of America (BAA) merged after the 1948-49 season to become today's National Basketball Association (NBA).",
            "The Boston Celtics have won the most NBA championships (17), including seven straight from 1960 to 1966.",
            "Kareem Abdul-Jabbar, who played 20 seasons in the NBA, holds the record for most points scored in a career with 38,387.",
            "On March 2, 1962, Philadelphia center Wilt Chamberlain scored 100 points in one game against New York. That is the most one player has ever scored in one game.",
            "Atlanta Hawks coach Lenny Wilkens has won more basketball games than any other coach.",
            "The American Basketball Association (ABA) was a 10-team rival league to the NBA that began play in the 1967-68 season and folded nine years later after the 1975-76 season.",
            "The NBA instituted the three-pointer before the 1979-80 season, an idea it borrowed from the ABA.",
            "The Chicago Bulls have won all six NBA Finals in which they've appeared.",
            "Michael Jordan, who retired in January 1999 but returned to the league in 2001, has scored more points (5,987) in the playoffs than any other player.",
            "The Naismith Memorial Basketball Hall of Fame is located in Springfield, Mass.",
            "The first women’s basketball uniforms were called “bloomer suits.” Designed to cover the entire body, they came with stockings that covered the lower legs.",
            "Josh Howard is even more bow legged than LeBron James is, however, it did not stop him from becoming a professional athlete.",
            "LeBron being dominant with his right hand yet, eating and writing with his left-hand, is pretty much as ambidextrous as it can get.",
            "Supposedly, before MWP’s rookie season in 1999, MWP tried to get a part-time job at Circuit City somewhere in the suburbs of Chicago.",
            "Most cheerleaders only do what they do on the side as a part-time job. They typically make $50-$150 per game, but they are also paid for the large amount of hours that they practice.",
            "In the 1987-1988 season, the shortest player and the tallest player in the NBA were on the same team, and they were Manute Bol and Muggsy Bogues.",
            "Shaq has made over 11,196 buckets, but only one of them was a 3-pointer. On February 16th, 1996, the Orlando Magic were playing against the Milwaukee Bucks and the Magic inbounded the ball with only two seconds left. ",
            "The salary cap fluctuates pretty often in the NBA, but as of last year, the max salary for a WNBA player was $101,500, while the maximum salary for a NBA player is north of $20 million. ",
            "In 1985, the Jordan’s were born and they would eventually go on to become the most popular sneakers of all-time. However, it did come with a bit of a cost early on.",
            "We have all seen double-doubles and triple-doubles with somewhat regularity in the NBA. David Robinson even got a quadruple-double once, where he had at least 10 points, 10 rebounds, 10 assists, and 10 blocks.",
            "It seems a bit ironic that millionaires can become broke so quickly, but it happens more often than you would think. Sixty percent of NBA players are broke after 5 years in retirement.",
            "While someone between 6’6” and 6’8” only has a .07% chance of making the NBA, someone that is 7 feet or taller has a 17% of making the NBA. ",
            "Charles Barkley was cut his freshman and sophomore years in high school. Eventually though, he did make the team, and he ended up having an excellent high school career.",
            "It is hard to believe that someone 5’3” even made it to the NBA. It is even harder to believe that someone 5’3” blocked 39 shots on taller players in the NBA.",
            "Years ago, the NBA didn’t only have 2 rounds in the draft, they had as many as 10 rounds. Since there weren’t really that many players around that could even be drafted, teams just selected random people, even if they didn’t play in the NBA.",
            "Bol humorously says that he killed the lion while it was asleep, otherwise, he would have been killed by the lion himself. Bol says that he threw a spear at the lion for killing one of his cows.",
            "Red Auerbach was one of the greatest coaches in the NBA and was known for lighting up a cigar after a key victory.",
            "At 6′9″, Magic Johnson was the tallest point guard in NBA history.",
            "The NBA’s Philadelphia 76ers are named for that city’s patriotic past; the Declaration of Independence was signed there in 1776.",
            "The tallest pro basketball player on earth is Paul Sturgess at 7′8″.",
            "There are 122 “pebbles,” or bumps, per inch on a Spalding basketball.",
            "Rasheed Wallace holds the NBA record in technical fouls with 317.",
            "Calvin Murphy holds the record for the NBA player with the most kids. He fathered 14 kids with 9 different women.",
            "In 2010, NBA uniforms were 30% lighter than in past years and dried twice as fast as previous ones.",
            "The average NBA player can jump about 28 inches off the ground.",
            "Basketball shorts were short until 1984, when Michael Jordan asked for longer ones.",
            "The longest game in NBA history occurred on 1951. Indianapolis Olympians beat the Rochester Royals 75–73 in 6 overtimes.",
            "NBA players run as much as four miles during a game.",
            "No other sport has more injuries than basketball, and the most common basketball injury is a sprained ankle.",
            "Kobe Bryant was the youngest player to start an NBA game at just 18.5 years old.",
            "The smallest city that has an NBA franchise is Salt Lake City.",
            "The player silhouetted in the NBA logo is former all-star Jerry West, who played with the Los Angeles Lakers.",
            "Paul Pierce of the Boston Celtics was stabbed 11 times in the face, neck, and back. Even after undergoing lung surgery, he made a full recovery and continued to play basketball."};

    public String getFact() {

        // Paspaudus mygtuka updatint TextView su nauju fact, kuris bus parinktas random
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        return facts[randomNumber];
    }
}
