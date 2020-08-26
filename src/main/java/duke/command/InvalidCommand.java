package duke.command;

import duke.DukeException;
import duke.Storage;
import duke.task.TaskList;
import duke.Ui;

/**
 * Class representing an invalid command.
 */
public class InvalidCommand extends Command {
    /**
     * Throws an exception that is to be caught by the bot.
     * @param tasks List of tasks.
     * @param ui Ui object.
     * @param storage Storage object.
     * @throws DukeException to signify an invalid command.
     */
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        throw new DukeException("Sorry I don't know what this means!");
    }
}
