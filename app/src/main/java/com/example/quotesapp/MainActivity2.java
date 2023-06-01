package com.example.quotesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    TextView txtname1;
    String title;
    RecyclerView rcv1;
    ArrayList<Modalclass2> detail = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initview();
    }

    private void initview() {
        txtname1 = findViewById(R.id.txtname1);
        rcv1 = findViewById(R.id.rcv1);

        if (getIntent() != null) {
            title = getIntent().getStringExtra("key");
            txtname1.setText(title);



            if (title.equals("Attitude")) {

                Modalclass2 m1 = new Modalclass2();
                m1.setQuote("Changing your mindset is a game changer.");
                detail.add(m1);

                Modalclass2 m2 = new Modalclass2();
                m2.setQuote("All your dreams can come true f you have the courage to purse them.");
                detail.add(m2);

                Modalclass2 m3 = new Modalclass2();
                m3.setQuote("If you look the right way, you can see that the whole world is a garden.");
                detail.add(m3);

                Modalclass2 m4 = new Modalclass2();
                m4.setQuote("Having a positive attitude isn’t wishy-washy, it’s a concrete and intelligent way to view problems, challenges, and obstacles.");
                detail.add(m4);

                Modalclass2 m5 = new Modalclass2();
                m5.setQuote("It makes a big difference in your life when you stay positive.");
                detail.add(m5);

                Modalclass2 m6 = new Modalclass2();
                m6.setQuote("Building a positive attitude begins with having confidence in yourself.");
                detail.add(m6);

                Modalclass2 m7 = new Modalclass2();
                m7.setQuote("A positive attitude is something everyone can work on, and everyone can learn how to employ it.");
                detail.add(m7);

                Modalclass2 m8 = new Modalclass2();
                m8.setQuote("A positive attitude may not solve all our problems but that is the only option we have if we want to get out of problems.");
                detail.add(m8);

                Modalclass2 m9 = new Modalclass2();
                m9.setQuote("Positive thinking will let you do everything better than negative thinking.");
                detail.add(m9);

                Modalclass2 m10 = new Modalclass2();
                m10.setQuote("The most important thing you’ll ever wear is your attitude.");
                detail.add(m10);

                Modalclass2 m11 = new Modalclass2();
                m11.setQuote("I don’t think of all the misery but of the beauty that still remains.");
                detail.add(m11);

                Modalclass2 m12 = new Modalclass2();
                m12.setQuote("Optimism is the faith that leads to achievement; nothing can be done without hope.");
                detail.add(m12);

                Modalclass2 m13 = new Modalclass2();
                m13.setQuote("Our future cannot depend on the government alone. The ultimate solutions lie in the attitudes and the actions of the American people.");
                detail.add(m13);

                Modalclass2 m14 = new Modalclass2();
                m14.setQuote("When a happy person comes into the room, it is as if another candle has been lit.");
                detail.add(m14);

                Modalclass2 m15 = new Modalclass2();
                m15.setQuote("Take the attitude of a student, never be too big to ask questions, never know too much to learn something new.");
                detail.add(m15);

            } else if (title.equals("Birthday")) {

                Modalclass2 m1 = new Modalclass2();
                m1.setQuote("Count your life by smiles, not tears Count your age by friends, not years. Happy birthday!");
                detail.add(m1);

                Modalclass2 m2 = new Modalclass2();
                m2.setQuote("Happy birthday! I hope all your birthday wishes and dreams come true.");
                detail.add(m2);

                Modalclass2 m3 = new Modalclass2();
                m3.setQuote("A wish for you on your birthday, whatever you ask may you receive, whatever you seek may you find, whatever you wish may it be fulfilled on your birthday and always. Happy birthday!");
                detail.add(m3);

                Modalclass2 m4 = new Modalclass2();
                m4.setQuote("Having a positive attitude isn’t wishy-washy, it’s a concrete and intelligent way to view problems, challenges, and obstacles.");
                detail.add(m4);

                Modalclass2 m5 = new Modalclass2();
                m5.setQuote("Another adventure filled year awaits you. Welcome it by celebrating your birthday with pomp and splendor. Wishing you a very happy and fun-filled birthday!");
                detail.add(m5);

                Modalclass2 m6 = new Modalclass2();
                m6.setQuote("May the joy that you have spread in the past come back to you on this day. Wishing you a very happy birthday!");
                detail.add(m6);

                Modalclass2 m7 = new Modalclass2();
                m7.setQuote("Happy birthday! Your life is just about to pick up speed and blast off into the stratosphere. Wear a seat belt and be sure to enjoy the journey. Happy birthday!");
                detail.add(m7);

                Modalclass2 m8 = new Modalclass2();
                m8.setQuote("This birthday, I wish you abundant happiness and love. May all your dreams turn into reality and may lady luck visit your home today. Happy birthday to one of the sweetest people I’ve ever known.");
                detail.add(m8);

                Modalclass2 m9 = new Modalclass2();
                m9.setQuote("May you be gifted with life’s biggest joys and never-ending bliss. After all, you yourself are a gift to earth, so you deserve the best. Happy birthday.");
                detail.add(m9);

                Modalclass2 m10 = new Modalclass2();
                m10.setQuote("The most important thing you’ll ever wear is your attitude.");
                detail.add(m10);

                Modalclass2 m11 = new Modalclass2();
                m11.setQuote("Count not the candles…see the lights they give. Count not the years, but the life you live. Wishing you a wonderful time ahead. Happy birthday.");
                detail.add(m11);

                Modalclass2 m12 = new Modalclass2();
                m12.setQuote("Forget the past; look forward to the future, for the best things are yet to come.");
                detail.add(m12);

                Modalclass2 m13 = new Modalclass2();
                m13.setQuote("Happy Birthday! You know, you don’t look that old. But then, you don’t look that young, either.");
                detail.add(m13);

                Modalclass2 m14 = new Modalclass2();
                m14.setQuote("Happy birthday to one of the few people whose birthday I can remember without a Facebook reminder.");
                detail.add(m14);

                Modalclass2 m15 = new Modalclass2();
                m15.setQuote("Don’t get all weird about getting older! Our age is merely the number of years the world has been enjoying us!");
                detail.add(m15);

            } else if (title.equals("Funny")) {
                Modalclass2 m1 = new Modalclass2();
                m1.setQuote("My mother always used to say: The older you get, the better you get, unless you’re a banana.");
                detail.add(m1);

                Modalclass2 m2 = new Modalclass2();
                m2.setQuote("Clothes make the man. Naked people have little or no influence in society.");
                detail.add(m2);

                Modalclass2 m3 = new Modalclass2();
                m3.setQuote("I love being married. It's so great to find that one special person you want to annoy for the rest of your life.");
                detail.add(m3);

                Modalclass2 m4 = new Modalclass2();
                m4.setQuote("Ned, I would love to stand here and talk with you—but I’m not going to.");
                detail.add(m4);

                Modalclass2 m5 = new Modalclass2();
                m5.setQuote("I want my children to have all the things I couldn't afford. Then I want to move in with them.");
                detail.add(m5);

                Modalclass2 m6 = new Modalclass2();
                m6.setQuote("Never follow anyone else’s path. Unless you’re in the woods and you’re lost and you see a path. Then by all means follow that path.!");
                detail.add(m6);

                Modalclass2 m7 = new Modalclass2();
                m7.setQuote("I walk around like everything’s fine, but deep down, inside my shoe, my sock is sliding off.");
                detail.add(m7);

                Modalclass2 m8 = new Modalclass2();
                m8.setQuote("I haven't spoken to my wife in years. I didn't want to interrupt her.");
                detail.add(m8);

                Modalclass2 m9 = new Modalclass2();
                m9.setQuote("There’s nothing wrong with you that an expensive operation can’t prolong.");
                detail.add(m9);

                Modalclass2 m10 = new Modalclass2();
                m10.setQuote("There is no sunrise so beautiful that it is worth waking me up to see it.");
                detail.add(m10);

                Modalclass2 m11 = new Modalclass2();
                m11.setQuote("There are only three ages for women in Hollywood: babe, district attorney and Driving Miss Daisy.");
                detail.add(m11);

                Modalclass2 m12 = new Modalclass2();
                m12.setQuote("Common sense is like deodorant. The people who need it most never use it.");
                detail.add(m12);

                Modalclass2 m13 = new Modalclass2();
                m13.setQuote("There’s nothing simpler than avoiding people you don’t like. Avoiding one’s friends, that’s the real test.");
                detail.add(m13);

                Modalclass2 m14 = new Modalclass2();
                m14.setQuote("If I’m not back in five minutes, just wait longer.");
                detail.add(m14);

                Modalclass2 m15 = new Modalclass2();
                m15.setQuote("A good rule to remember for life is that when it comes to plastic surgery and sushi, never be attracted by a bargain.");
                detail.add(m15);

            } else if (title.equals("Good Morning")) {
                Modalclass2 m1 = new Modalclass2();
                m1.setQuote("Mornings are like nature in spring… humming with the sounds of life and the promise of a fresh new day!");
                detail.add(m1);

                Modalclass2 m2 = new Modalclass2();
                m2.setQuote("The morning was full of sunlight and hope.");
                detail.add(m2);

                Modalclass2 m3 = new Modalclass2();
                m3.setQuote("Have a beautiful day ahead! Good morning!!");
                detail.add(m3);

                Modalclass2 m4 = new Modalclass2();
                m4.setQuote("A smile is a curve that sets everything straight Pass it on and share a smile with friends on this beautiful morning.");
                detail.add(m4);

                Modalclass2 m5 = new Modalclass2();
                m5.setQuote("Everyday is a new beginning. Take a deep breath, smile, and start again. Good Morning!");
                detail.add(m5);

                Modalclass2 m6 = new Modalclass2();
                m6.setQuote("When you arise in the morning, think of what a precious privilege it is to be alive – to breathe, to think, to enjoy, to love – then make that day count!");
                detail.add(m6);

                Modalclass2 m7 = new Modalclass2();
                m7.setQuote("I walk around like everything’s fine, but deep down, inside my shoe, my sock is sliding off.");
                detail.add(m7);

                Modalclass2 m8 = new Modalclass2();
                m8.setQuote("Some people dream of success, while other people get up every morning and make it happen.");
                detail.add(m8);

                Modalclass2 m9 = new Modalclass2();
                m9.setQuote(".There is a morning inside you waiting to burst open into light.");
                detail.add(m9);

                Modalclass2 m10 = new Modalclass2();
                m10.setQuote("Good Morning!!! You have to get up every morning and tell yourself that you can do it");
                detail.add(m10);

                Modalclass2 m11 = new Modalclass2();
                m11.setQuote("There are only three ages for women in Hollywood: babe, district attorney and Driving Miss Daisy.");
                detail.add(m11);

                Modalclass2 m12 = new Modalclass2();
                m12.setQuote("Good Morning! Have a peaceful day filled with joy and happiness.");
                detail.add(m12);

                Modalclass2 m13 = new Modalclass2();
                m13.setQuote("Good Morning. Everyday do something that will inch you closer to a better tomorrow.");
                detail.add(m13);

                Modalclass2 m14 = new Modalclass2();
                m14.setQuote("Morning is wonderful. Its only drawback is that it comes at such an inconvenient time of day");
                detail.add(m14);

                Modalclass2 m15 = new Modalclass2();
                m15.setQuote("Early morning cheerfulness can be extremely obnoxious.");
                detail.add(m15);

            } else if (title.equals("Love")) {
                Modalclass2 m1 = new Modalclass2();
                m1.setQuote("Loved you yesterday, love you still, always have, always will.");
                detail.add(m1);

                Modalclass2 m2 = new Modalclass2();
                m2.setQuote("I’ll be loving you, always with a love that’s true.");
                detail.add(m2);

                Modalclass2 m3 = new Modalclass2();
                m3.setQuote("I need you like a heart needs a beat.");
                detail.add(m3);

                Modalclass2 m4 = new Modalclass2();
                m4.setQuote("I swear I couldn’t love you more than I do right now, and yet I know I will tomorrow.");
                detail.add(m4);

                Modalclass2 m5 = new Modalclass2();
                m5.setQuote("If you live to be a hundred, I want to live to be a hundred minus one day so I never have to live without you.");
                detail.add(m5);

                Modalclass2 m6 = new Modalclass2();
                m6.setQuote("A man is already halfway in love with any woman who listens to him.");
                detail.add(m6);

                Modalclass2 m7 = new Modalclass2();
                m7.setQuote("Women are meant to be loved, not to be understood.");
                detail.add(m7);

                Modalclass2 m8 = new Modalclass2();
                m8.setQuote("To love is to burn, to be on fire.");
                detail.add(m8);

                Modalclass2 m9 = new Modalclass2();
                m9.setQuote("In the end we discover that to love and let go can be the same thing.");
                detail.add(m9);

                Modalclass2 m10 = new Modalclass2();
                m10.setQuote("Pleasure of love lasts but a moment. Pain of love lasts a lifetime.");
                detail.add(m10);

                Modalclass2 m11 = new Modalclass2();
                m11.setQuote("Love is so short, forgetting is so long.");
                detail.add(m11);

                Modalclass2 m12 = new Modalclass2();
                m12.setQuote("Romance is the glamour which turns the dust of everyday life into a golden haze.");
                detail.add(m12);

                Modalclass2 m13 = new Modalclass2();
                m13.setQuote("One word frees us of all the weight and pain of life: that word is love.");
                detail.add(m13);

                Modalclass2 m14 = new Modalclass2();
                m14.setQuote("So, I love you because the entire universe conspired to help me find you.");
                detail.add(m14);

                Modalclass2 m15 = new Modalclass2();
                m15.setQuote("If you remember me, then I don’t care if everyone else forgets.");
                detail.add(m15);

            } else if (title.equals("Motivational")) {
                Modalclass2 m1 = new Modalclass2();
                m1.setQuote("You can get everything in life you want if you will just help enough other people get what they want.");
                detail.add(m1);

                Modalclass2 m2 = new Modalclass2();
                m2.setQuote("Inspiration does exist, but it must find you working.");
                detail.add(m2);

                Modalclass2 m3 = new Modalclass2();
                m3.setQuote("Show up, show up, show up, and after a while the muse shows up, too.");
                detail.add(m3);

                Modalclass2 m4 = new Modalclass2();
                m4.setQuote("Don't bunt. Aim out of the ballpark, Aim for the company of immortals.");
                detail.add(m4);

                Modalclass2 m5 = new Modalclass2();
                m5.setQuote("I have stood on a mountain of no’s for one yes.");
                detail.add(m5);

                Modalclass2 m6 = new Modalclass2();
                m6.setQuote("The best way out is always through.");
                detail.add(m6);

                Modalclass2 m7 = new Modalclass2();
                m7.setQuote("If there is no struggle, there is no progress.");
                detail.add(m7);

                Modalclass2 m8 = new Modalclass2();
                m8.setQuote("Courage is like a muscle. We strengthen it by use.");
                detail.add(m8);

                Modalclass2 m9 = new Modalclass2();
                m9.setQuote("Keep a little fire burning; however small, however hidden.");
                detail.add(m9);

                Modalclass2 m10 = new Modalclass2();
                m10.setQuote("Never let success get to your head and never let failure get to your heart.");
                detail.add(m10);

                Modalclass2 m11 = new Modalclass2();
                m11.setQuote("I’d rather regret the things I’ve done than regret the things I haven’t done.");
                detail.add(m11);

                Modalclass2 m12 = new Modalclass2();
                m12.setQuote("I do not try to dance better than anyone else. I only try to dance better than myself.");
                detail.add(m12);

                Modalclass2 m13 = new Modalclass2();
                m13.setQuote("If you don’t risk anything, you risk even more.");
                detail.add(m13);

                Modalclass2 m14 = new Modalclass2();
                m14.setQuote("You can never leave footprints that last if you are always walking on tiptoe.");
                detail.add(m14);

                Modalclass2 m15 = new Modalclass2();
                m15.setQuote("If you don’t like the road you’re walking, start paving another one.");
                detail.add(m15);

            } else if (title.equals("Break Up")) {
                Modalclass2 m1 = new Modalclass2();
                m1.setQuote("It’s better to be single with a standard than losing yourself for approval.");
                detail.add(m1);

                Modalclass2 m2 = new Modalclass2();
                m2.setQuote("Some things break your heart but fix your vision.");
                detail.add(m2);

                Modalclass2 m3 = new Modalclass2();
                m3.setQuote("Pain makes you stronger, fear makes you braver, heartbreak makes you wiser.");
                detail.add(m3);

                Modalclass2 m4 = new Modalclass2();
                m4.setQuote("I will not allow myself to not feel chosen every single day. And I’ll wait till whenever that is.");
                detail.add(m4);

                Modalclass2 m5 = new Modalclass2();
                m5.setQuote("Pain makes you stronger, fear makes you braver, heartbreak makes you wiser.");
                detail.add(m5);

                Modalclass2 m6 = new Modalclass2();
                m6.setQuote("Sometimes good things fall apart so better things can come together.");
                detail.add(m6);

                Modalclass2 m7 = new Modalclass2();
                m7.setQuote("Accept what is, let go of what was, and have faith in what will be.");
                detail.add(m7);

                Modalclass2 m8 = new Modalclass2();
                m8.setQuote("Don’t cry because it’s over, smile because it happened.");
                detail.add(m8);

                Modalclass2 m9 = new Modalclass2();
                m9.setQuote("Pain makes you stronger, fear makes you braver, heartbreak makes you wiser.");
                detail.add(m9);

                Modalclass2 m10 = new Modalclass2();
                m10.setQuote("Whatever you do, never run back to what broke you.");
                detail.add(m10);

                Modalclass2 m11 = new Modalclass2();
                m11.setQuote("Sometimes good things fall apart so better things can fall together");
                detail.add(m11);

                Modalclass2 m12 = new Modalclass2();
                m12.setQuote("We have to be whole people to find whole love");
                detail.add(m12);

                Modalclass2 m13 = new Modalclass2();
                m13.setQuote("Never allow someone to be your priority while allowing yourself to be their option.");
                detail.add(m13);

                Modalclass2 m14 = new Modalclass2();
                m14.setQuote("Six letters, two words, easy to say, hard to explain, harder to do: Move on.");
                detail.add(m14);

                Modalclass2 m15 = new Modalclass2();
                m15.setQuote("Sometimes, your heart needs more time to accept what your mind already knows.");
                detail.add(m15);

            } else if (title.equals("Beautiful")) {
                Modalclass2 m1 = new Modalclass2();
                m1.setQuote("The greatest glory in living lies not in never falling, but in rising every time we fall.");
                detail.add(m1);

                Modalclass2 m2 = new Modalclass2();
                m2.setQuote("he way to get started is to quit talking and begin doing.");
                detail.add(m2);

                Modalclass2 m3 = new Modalclass2();
                m3.setQuote("If life were predictable it would cease to be life, and be without flavor.");
                detail.add(m3);

                Modalclass2 m4 = new Modalclass2();
                m4.setQuote("If you set your goals ridiculously high and it's a failure, you will fail above everyone else's success.");
                detail.add(m4);

                Modalclass2 m5 = new Modalclass2();
                m5.setQuote("Life is what happens when you're busy making other plans.");
                detail.add(m5);

                Modalclass2 m6 = new Modalclass2();
                m6.setQuote("Whoever is happy will make others happy too.");
                detail.add(m6);

                Modalclass2 m7 = new Modalclass2();
                m7.setQuote("When you reach the end of your rope, tie a knot in it and hang on.");
                detail.add(m7);

                Modalclass2 m8 = new Modalclass2();
                m8.setQuote("Tell me and I forget. Teach me and I remember. Involve me and I learn.");
                detail.add(m8);

                Modalclass2 m9 = new Modalclass2();
                m9.setQuote("It is during our darkest moments that we must focus to see the light.");
                detail.add(m9);

                Modalclass2 m10 = new Modalclass2();
                m10.setQuote("Whoever is happy will make others happy too.");
                detail.add(m10);

                Modalclass2 m11 = new Modalclass2();
                m11.setQuote("Always remember that you are absolutely unique. Just like everyone else.");
                detail.add(m11);

                Modalclass2 m12 = new Modalclass2();
                m12.setQuote("Don't judge each day by the harvest you reap but by the seeds that you plant.");
                detail.add(m12);

                Modalclass2 m13 = new Modalclass2();
                m13.setQuote("The future belongs to those who believe in the beauty of their dreams.");
                detail.add(m13);

                Modalclass2 m14 = new Modalclass2();
                m14.setQuote("Tell me and I forget. Teach me and I remember. Involve me and I learn.");
                detail.add(m14);

                Modalclass2 m15 = new Modalclass2();
                m15.setQuote("It is during our darkest moments that we must focus to see the light.");
                detail.add(m15);

            } else if (title.equals("Bike")) {
                Modalclass2 m1 = new Modalclass2();
                m1.setQuote("Race the Rain. Ride the Win. Chase Sunset. Only a Biker Understands.");
                detail.add(m1);

                Modalclass2 m2 = new Modalclass2();
                m2.setQuote("Bicycles are ride-able artworks. And they have the potential to save the world.");
                detail.add(m2);

                Modalclass2 m3 = new Modalclass2();
                m3.setQuote("Biker by heart, rider by soul.");
                detail.add(m3);

                Modalclass2 m4 = new Modalclass2();
                m4.setQuote("Get a bicycle. You will certainly not regret it, as long as you live.");
                detail.add(m4);

                Modalclass2 m5 = new Modalclass2();
                m5.setQuote("Look towards your destination, not towards where you’re not going.");
                detail.add(m5);

                Modalclass2 m6 = new Modalclass2();
                m6.setQuote("A bad day on a mountain bike always beats a good day in the office.");
                detail.add(m6);

                Modalclass2 m7 = new Modalclass2();
                m7.setQuote("Couples who ride together, more often than not, stay together.");
                detail.add(m7);

                Modalclass2 m8 = new Modalclass2();
                m8.setQuote("Hobby is when you acquire a new bike. Passion is when you keep the old one running.");
                detail.add(m8);

                Modalclass2 m9 = new Modalclass2();
                m9.setQuote("Life is a lot like riding a bike. Once you stop riding, you fall down.");
                detail.add(m9);

                Modalclass2 m10 = new Modalclass2();
                m10.setQuote("The bicycle is a simple solution to some of the world’s most complicated problems.");
                detail.add(m10);

                Modalclass2 m11 = new Modalclass2();
                m11.setQuote("You can go as slowly as you want, as long as you don’t stop.");
                detail.add(m11);

                Modalclass2 m12 = new Modalclass2();
                m12.setQuote("The only thing better than a street bike.. is a woman riding one.");
                detail.add(m12);

                Modalclass2 m13 = new Modalclass2();
                m13.setQuote("My first car was a motorcycle.");
                detail.add(m13);

                Modalclass2 m14 = new Modalclass2();
                m14.setQuote("I don’t really feel like going for a ride today. Said no motorcycle rider ever.");
                detail.add(m14);

                Modalclass2 m15 = new Modalclass2();
                m15.setQuote("We need to go for an adventure road trip.");
                detail.add(m15);

            } else if (title.equals("Brother")) {
                Modalclass2 m1 = new Modalclass2();
                m1.setQuote("Sometimes being a brother is even better than being a superhero.");
                detail.add(m1);

                Modalclass2 m2 = new Modalclass2();
                m2.setQuote("People are realizing that color has no bearing on what’s known as brotherhood.");
                detail.add(m2);

                Modalclass2 m3 = new Modalclass2();
                m3.setQuote("Brotherhood is the very price and condition of man’s survival.");
                detail.add(m3);

                Modalclass2 m4 = new Modalclass2();
                m4.setQuote("Brotherhood is the very price and condition of man’s survival.");
                detail.add(m4);

                Modalclass2 m5 = new Modalclass2();
                m5.setQuote("A brother is a first friend and a second father.");
                detail.add(m5);

                Modalclass2 m6 = new Modalclass2();
                m6.setQuote("A bad brother is far better than no brother.");
                detail.add(m6);

                Modalclass2 m7 = new Modalclass2();
                m7.setQuote("I may fight with my siblings. But once you lay a finger on them, you’ll be facing me.");
                detail.add(m7);

                Modalclass2 m8 = new Modalclass2();
                m8.setQuote("Neither of us is perfect but our imperfections make us the cute siblings that we are.");
                detail.add(m8);

                Modalclass2 m9 = new Modalclass2();
                m9.setQuote("Brotherhood means I will be there for you no matter what.");
                detail.add(m9);

                Modalclass2 m10 = new Modalclass2();
                m10.setQuote("My brother is my irreplaceable best friend.");
                detail.add(m10);

                Modalclass2 m11 = new Modalclass2();
                m11.setQuote("The highlight of my life is making my brother laugh.");
                detail.add(m11);

                Modalclass2 m12 = new Modalclass2();
                m12.setQuote("My protection and nemesis, my brother.");
                detail.add(m12);

                Modalclass2 m13 = new Modalclass2();
                m13.setQuote("Brothers are there to share childhood memories and grown-up dreams.");
                detail.add(m13);

                Modalclass2 m14 = new Modalclass2();
                m14.setQuote("Some people believe in heroes. I have my brother.");
                detail.add(m14);

                Modalclass2 m15 = new Modalclass2();
                m15.setQuote("My brother has the coolest sister.");
                detail.add(m15);

            } else if (title.equals("Angry")) {
                Modalclass2 m1 = new Modalclass2();
                m1.setQuote("When angry count to ten before you speak. If very angry, count to one hundred.");
                detail.add(m1);

                Modalclass2 m2 = new Modalclass2();
                m2.setQuote("Anger can kill, even a feather gently blowing in the wind..");
                detail.add(m2);

                Modalclass2 m3 = new Modalclass2();
                m3.setQuote("What Is Anger? It is a punishment we give to ouself, for someone else’s mistake!");
                detail.add(m3);

                Modalclass2 m4 = new Modalclass2();
                m4.setQuote("I grew up with lots of anger, frustration and violence in my heart.");
                detail.add(m4);

                Modalclass2 m5 = new Modalclass2();
                m5.setQuote("Only three type of people tell the truth: Kids, the drunk, and the angry.");
                detail.add(m5);

                Modalclass2 m6 = new Modalclass2();
                m6.setQuote("I Don’t Usually Lose My Temper, But If I Do It’s True I M Scary.");
                detail.add(m6);

                Modalclass2 m7 = new Modalclass2();
                m7.setQuote("Try to manage your anger since people can’t manage their stupidity..");
                detail.add(m7);

                Modalclass2 m8 = new Modalclass2();
                m8.setQuote("Anger and intolerance are the enemies of correct understanding.");
                detail.add(m8);

                Modalclass2 m9 = new Modalclass2();
                m9.setQuote("For every minute you are angry you lose sixty seconds of happiness..");
                detail.add(m9);

                Modalclass2 m10 = new Modalclass2();
                m10.setQuote("Nobody makes you Angry you decide to use anger as a response..");
                detail.add(m10);

                Modalclass2 m11 = new Modalclass2();
                m11.setQuote("Control your “Anger” because it is Just one Letter away From “D” anger.");
                detail.add(m11);

                Modalclass2 m12 = new Modalclass2();
                m12.setQuote("Anger is the fuel of losing control.");
                detail.add(m12);

                Modalclass2 m13 = new Modalclass2();
                m13.setQuote("I don’t need anger management, you just need to stop making me angry!!");
                detail.add(m13);

                Modalclass2 m14 = new Modalclass2();
                m14.setQuote("When you are angry Be Silenty.");
                detail.add(m14);

                Modalclass2 m15 = new Modalclass2();
                m15.setQuote("Some people need to open their small minds instead of their big mouths!");
                detail.add(m15);

            } else if (title.equals("Anniversary")) {
                Modalclass2 m1 = new Modalclass2();
                m1.setQuote("Thanks for joining me on this lifetime journey! Here's to many more years.");
                detail.add(m1);

                Modalclass2 m2 = new Modalclass2();
                m2.setQuote("Finding a love like yours feels like a dream. Please don't wake me up!");
                detail.add(m2);

                Modalclass2 m3 = new Modalclass2();
                m3.setQuote("I read a lot of books, but our love story is my favorite.");
                detail.add(m3);

                Modalclass2 m4 = new Modalclass2();
                m4.setQuote("On this day, and every day, I am reminded why we are meant for each other.");
                detail.add(m4);

                Modalclass2 m5 = new Modalclass2();
                m5.setQuote("Every day, every month, and every year... I love you more than the last.");
                detail.add(m5);

                Modalclass2 m6 = new Modalclass2();
                m6.setQuote("There's no words to explain what I feel when I look into your eyes. Just love.");
                detail.add(m6);

                Modalclass2 m7 = new Modalclass2();
                m7.setQuote("Life without you would be life without air. I love you.");
                detail.add(m7);

                Modalclass2 m8 = new Modalclass2();
                m8.setQuote("My love for you is everlasting. Cheers to another year with my favorite person.");
                detail.add(m8);

                Modalclass2 m9 = new Modalclass2();
                m9.setQuote("Wishing us a blissful lifetime together. Happy anniversary!");
                detail.add(m9);

                Modalclass2 m10 = new Modalclass2();
                m10.setQuote("Walking alongside you is the greatest journey of my life. I’ll cherish you always. Happy anniversary.");
                detail.add(m10);

                Modalclass2 m11 = new Modalclass2();
                m11.setQuote("Marrying you was the best thing that’s ever happened to me.");
                detail.add(m11);

                Modalclass2 m12 = new Modalclass2();
                m12.setQuote("This is our first year together, but we have an eternity to go!");
                detail.add(m12);

                Modalclass2 m13 = new Modalclass2();
                m13.setQuote("Happy anniversary, honey. You make my life sweeter.");
                detail.add(m13);

                Modalclass2 m14 = new Modalclass2();
                m14.setQuote("Nothing on earth compares to my love for you. Happy anniversary to my better half.");
                detail.add(m14);

                Modalclass2 m15 = new Modalclass2();
                m15.setQuote("Congrats to us on rocking this marriage stuff.");
                detail.add(m15);

            }


            QuotesInterface quotesInterface = new QuotesInterface() {
                @SuppressLint("ServiceCast")
                @Override
                public void Clickcpy(String quote) {
                    ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                    ClipData clip = ClipData.newPlainText("label", quote);
                    clipboard.setPrimaryClip(clip);
                }

                @Override
                public void Clickshare(String quote) {
                    Intent intent = new Intent(android.content.Intent.ACTION_SEND);
                    intent.setType("text/plain");
                    intent.putExtra(android.content.Intent.EXTRA_TEXT, quote);
                    /*Fire!*/
                    startActivity(Intent.createChooser(intent, "share"));
                }

            };
            SecondpageAdapter adapter = new SecondpageAdapter(MainActivity2.this, detail, quotesInterface);
            rcv1.setAdapter(adapter);
            LinearLayoutManager manager = new LinearLayoutManager(MainActivity2.this, RecyclerView.VERTICAL, false);
            rcv1.setLayoutManager(manager);

        }


    }
}