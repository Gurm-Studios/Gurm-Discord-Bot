package net.gurm.studios.discord.bot.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

public class Embed extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getMessage().getContentRaw().equals("!무")) {
            EmbedBuilder eb = new EmbedBuilder();
            eb.setTitle("무정부 야생");
            eb.addField("버전", "1.18.1", false);
            eb.addField("주소", "mc.anarchy.gurm-studios.net", true);
            eb.addField("마인리스트", "[링크](https://minelist.kr/servers/mc.gurm-studios.net/)", true);
            eb.addField("Skhlist", "[링크](https://skhlist.com/server/762)", true);
            eb.addField("서버 설명", "약탈이나 욕설, pvp등 모든것이 가능한 서버", false);
            eb.addField("운영시간", "24시간", false);
            eb.addField("주의사항", "다른 서버(RPG, FPS, 건축 등)에 핵클라이언트로 접속하면은 서버 영구 밴입니다.\n", false);
            eb.setThumbnail("https://media.discordapp.net/attachments/919594844937154567/926498959155945522/banner.png");
            eb.setFooter("Gurm Studios", "https://cdn.discordapp.com/attachments/872816095789195274/926075491839000646/-1.png");
            eb.setColor(Color.PINK);
            event.getChannel().sendMessageEmbeds(eb.build()).queue();

        }
        if (event.getMessage().getContentRaw().equals("!구")) {
            EmbedBuilder eb = new EmbedBuilder();
            eb.setTitle("구름 서버");
            eb.addField("버전", "1.12.2 ~ 1.18.1", false);
            eb.addField("주소", "mc.gurm-studios.net", true);
            eb.addField("마인리스트", "[링크](https://gurm-studios.net)", true);
            eb.addField("Skhlist", "[링크](https://gurm-studios.net)", true);
            eb.addField("서버 설명", "", false);
            eb.addField("운영시간", "24시간", false);
            eb.setThumbnail("https://media.discordapp.net/attachments/919594844937154567/926498959155945522/banner.png");
            eb.setFooter("Gurm Studios", "https://cdn.discordapp.com/attachments/872816095789195274/926075491839000646/-1.png");
            eb.setColor(Color.PINK);
            event.getChannel().sendMessageEmbeds(eb.build()).queue();
        }
        
        /*                                                                                Admin Disocrd API                                                                              */
        /*                                                                                Admin Disocrd API                                                                              */
        /*                                                                                Admin Discord API                                                                              */
        if (event.getMessage().getContentRaw().equals("!1")) {
            EmbedBuilder eb = new EmbedBuilder();
            /*             eb.addField("", "", false);     */
            eb.setTitle("Discord API");
            eb.addField("C", "[Orca](https://github.com/cee-studio/orca)", false);

            eb.addField("C++", "[~~aegis.cpp~~](https://github.com/zeroxs/aegis.cpp) | [D++](https://github.com/brainboxdotcc/DPP) | [Discord++](https://github.com/DiscordPP/discordpp) | [Sleepy Discord](https://github.com/yourWaifu/sleepy-discord)", false);

            eb.addField("C#", "[Discord.Net](https://github.com/discord-net/Discord.Net) | [DSharpPlus](https://github.com/DSharpPlus/DSharpPlus) | [Remora.Discord](https://github.com/Nihlus/Remora.Discord)", false);

            eb.addField("Clojure", "[Discljord](https://github.com/discljord/discljord)", false);

            eb.addField("Crystal", "[Discordcr](https://github.com/shardlab/discordcr)", false);

            eb.addField("Dart", "[Nyxx](https://github.com/nyxx-discord/nyxx)", false);

            eb.addField("Elixir", "[Coxir](https://github.com/satom99/coxir) | [Nostrum](https://github.com/Kraigie/nostrum)", false);

            eb.addField("Go", "[DiscordGo](https://github.com/bwmarrin/discordgo) | [DisGord](https://github.com/andersfylling/disgord)", false);

            eb.addField("Java", "[Catnip](https://github.com/mewna/catnip) | [Discord4J](https://discord4j.com/) | [Javacord](https://github.com/Javacord/Javacord) | [JDA](https://github.com/DV8FromTheWorld/JDA)", false);

            eb.addField("Kotlin", "[Kord](https://github.com/kordlib/kord) | [Diskord](https://github.com/JesseCorbett/Diskord) | [Kordis](https://github.com/Tea-Ayataka/Kordis)", false);

            eb.addField("JavaScript", "[Discord.js](https://github.com/discordjs/discord.js) | [Eris](https://github.com/abalabahaha/eris)", false);

            eb.addField("Julia", "[Discord.jl](https://github.com/Xh4H/Discord.jl)", false);

            eb.addField("Lua", "[Discordia](https://github.com/SinisterRectus/Discordia) | [Lacord](https://github.com/Mehgugs/lacord)", false);

            eb.addField("Nim", "[Dimscord](https://github.com/krisppurg/dimscord) | [Discordnim](https://github.com/Krognol/discordnim)", false);

            eb.addField("PHP", "[DiscordPHP](https://github.com/discord-php/DiscordPHP) | [RestCord](https://www.restcord.com/)", false);

            eb.addField("Python", "[~~Discord.py~~](https://github.com/Rapptz/discord.py) | [~~Disco~~](https://github.com/b1naryth1ef/disco) | [Disnake](https://github.com/DisnakeDev/disnake) | [Hikari](https://github.com/hikari-py/hikari) | [Nextcord](https://github.com/nextcord/nextcord) | [Pycord](https://github.com/Pycord-Development/pycord)", false);

            eb.addField("Ruby", "[Discordrb](https://github.com/shardlab/discordrb)", false);

            eb.addField("Rust", "[Discord-rs](https://github.com/SpaceManiac/discord-rs) | [Serenity](https://github.com/serenity-rs/serenity) | [Twilight](https://github.com/twilight-rs/twilight)", false);

            eb.addField("Scala", "[AckCord](https://github.com/Katrix/AckCord)", false);

            eb.addField("Swift", "[Sword](https://github.com/Azoy/Sword)", false);

            eb.addField("TypeScript", "[Detritus](https://github.com/detritusjs/client) | [Discordeno](https://github.com/discordeno/discordeno) | [Droff](https://github.com/tim-smart/droff) | [Harmony](https://github.com/harmonyland/harmony)", false);

            /*               이미지 | 그런것(???)                        */
            eb.setThumbnail("https://discordguide.github.io/assets/API.png");
            eb.setFooter("Gurm Studios Inc.", "https://avatars.githubusercontent.com/u/96945410?s=200&v=4");
            eb.setColor(Color.DARK_GRAY);
            event.getChannel().sendMessageEmbeds(eb.build()).queue();
        }
    }
}
