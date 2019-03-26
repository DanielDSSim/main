package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import seedu.address.logic.CommandHistory;
import seedu.address.model.Model;

/**
 * Clears Interviews.
 */
public class ClearInterviewsCommand extends Command {

    public static final String COMMAND_WORD = "clearInterviews";
    public static final String MESSAGE_SUCCESS = "Interviews has been cleared!";

    @Override
    public CommandResult execute(Model model, CommandHistory history) {
        requireNonNull(model);
        model.clearInterviews();
        model.commitAddressBook();
        return new CommandResult(MESSAGE_SUCCESS);
    }

}
