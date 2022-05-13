package main;

import java.io.File;

import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.managers.AudioManager;
import net.dv8tion.jda.api.utils.WidgetUtil.Widget.VoiceChannel;

public class Commands extends ListenerAdapter{
	public String prefix = "!";
	public File santi;
	
	@Override
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
			String[] args = event.getMessage().getContentRaw().split(" ");
			
			if(args[0].equalsIgnoreCase(prefix + "test")) {
				event.getChannel().sendMessage("Bot funcionando correctamente :)").queue();
			}
			
			if(args[0].equalsIgnoreCase(prefix + "santi")) {
				event.getChannel().sendMessage("Santi putaso").queue();
			}
			
			if(args[0].equalsIgnoreCase(prefix + "alvaro")) {
				event.getChannel().sendMessage("OMG HIIII").queue();
			}
			
			santi = new File("\\Users\\guill\\Desktop\\santi.jpeg");
			
			if(args[0].equalsIgnoreCase(prefix + "orejas")) {
				event.getChannel().sendMessage("Orejon").addFile(santi).queue();
			}
			
			if(args[0].equalsIgnoreCase(prefix + "help")) {
				event.getChannel().sendMessage("=========== BOT MENU ===========" + "\n" + "========== EN PROCESO ==========").queue();
			}
			
			if(args[0].equalsIgnoreCase(prefix + "ping")) {
				event.getChannel().sendMessage("pong").queue();
			}
			
			if(args[0].equalsIgnoreCase(prefix + "music")) {
				event.getChannel().sendMessage("Inserte URL de YouTube (Aun no funciona)").queue();
			}
			
			if(args[0].equalsIgnoreCase(prefix + "type")) {
				event.getChannel().sendTyping().queue();
			}
			
			if(args[0].equalsIgnoreCase(prefix + "comandos")) {
				event.getChannel().sendMessage("Siempre el prefijo ! delante" + "\n" + "-Santi" + "\n" + "-Help" + "\n" + "-ing" + "\n" + "-Music"
						+ "\n" + "-Type" + "\n" + "-Comandos").queue();
			}
			
			if(args[0].equalsIgnoreCase(prefix + "comandos")) {
				event.getChannel().sendMessage("Hola");
			}
			
	}
	
}
