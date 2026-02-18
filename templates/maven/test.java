//DEPS dev.tamboui:tamboui-toolkit:LATEST
//DEPS dev.tamboui:tamboui-jline3-backend:LATEST
//REPOS central
// Only needed for snapshot versions
//REPOS central-portal-snapshots
//JAVA 21+

import static dev.tamboui.widgets.table.Cell.from;

import dev.tamboui.buffer.Buffer;
import dev.tamboui.inline.InlineDisplay;
import dev.tamboui.layout.Constraint;
import dev.tamboui.layout.Rect;
import dev.tamboui.style.Color;
import dev.tamboui.style.Style;
import dev.tamboui.text.MarkupParser;
import dev.tamboui.widgets.block.Block;
import dev.tamboui.widgets.block.Borders;
import dev.tamboui.widgets.table.Row;
import dev.tamboui.widgets.table.Table;
import dev.tamboui.widgets.table.TableState;

public final class test {

    public static void main(String[] args) throws Exception {
        var table = Table.builder()
            .header(Row.from(
                from(MarkupParser.parse("[cyan]Project")),
                from("[cyan]Status"),
                from("[cyan]Version")
            ))
            .rows(
                Row.from(from("Mordant"), from("Stable").style(Style.EMPTY.fg(Color.GREEN)), from("3.0.2")),
                Row.from(from("Clikt"), from("Stable").style(Style.EMPTY.fg(Color.GREEN)), from("5.0.2")),
                Row.from(from("Colormath"), from("Beta").style(Style.EMPTY.fg(Color.YELLOW)), from("3.6.0"))
            )
            .footer(Row.from("Total Projects: 3", "", ""))
            .widths(Constraint.percentage(50), Constraint.length(10), Constraint.fill())
           // .block(Block.builder().borders(Borders.ALL).title("TamboUI Table").build())
            .build();

        TableState state = new TableState();

        try (InlineDisplay display = InlineDisplay.create(12)) {
            display.render((Rect area, Buffer buffer) -> table.render(area, buffer, state));
           // Thread.sleep(5000);
        }
    }
}
