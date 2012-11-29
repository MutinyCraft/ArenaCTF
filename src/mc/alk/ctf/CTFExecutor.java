package mc.alk.ctf;

import mc.alk.arena.executors.BAExecutor;
import mc.alk.arena.executors.MCCommand;
import mc.alk.arena.objects.ArenaPlayer;
import mc.alk.arena.objects.arenas.Arena;

import org.bukkit.command.CommandSender;

public class CTFExecutor extends BAExecutor{

	@MCCommand(cmds={"addFlag"}, inGame=true, admin=true)
	public boolean addFlag(ArenaPlayer sender, Arena arena, Integer index) {
		return CTFExecutors.addFlag(sender,arena,index);
	}

	@MCCommand(cmds={"clearFlags"}, admin=true)
	public boolean clearFlags(CommandSender sender, Arena arena) {
		return CTFExecutors.clearFlags(sender,arena);
	}
}
