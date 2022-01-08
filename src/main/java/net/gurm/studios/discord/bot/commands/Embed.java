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
    }
}
