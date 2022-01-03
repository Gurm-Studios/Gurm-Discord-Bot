package net.gurm.studios.discord.bot;


import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.gurm.studios.discord.bot.commands.Commands;
import net.gurm.studios.discord.bot.commands.Embed;

import javax.security.auth.login.LoginException;
import java.awt.*;

public class Main extends ListenerAdapter {

    public static void main(String[] Args) throws LoginException {
        JDA jda = JDABuilder.createDefault("").build(); //기본 jda

        System.out.println("실행" );

        jda.getPresence().setActivity(Activity.playing("TEST"));


        jda.addEventListener(new Commands());
        jda.addEventListener(new Embed());
        jda.addEventListener(new Main());
    }


}
