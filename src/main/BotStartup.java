package main;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.requests.GatewayIntent;


public class BotStartup {
	
	public static void main(String[] args) throws LoginException {
		JDABuilder jda = JDABuilder.createDefault("OTY2ODczMDk4MTY5MjI1MjU3.YmIEvg.cCJqcumuFsmZqR17Qbs2GvWqATk");
		jda.setActivity(Activity.listening("!help"));
		jda.setStatus(OnlineStatus.ONLINE);
		jda.addEventListeners(new Commands());
		jda.build();
			
}	
}
