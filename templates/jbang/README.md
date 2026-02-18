# JBang Template for TamboUI Toolkit

This is a minimal JBang template for creating TamboUI Toolkit applications that can be run directly without a build system.

## Requirements

- Java 21 or later
- JBang 0.136 or higher installed (see https://www.jbang.dev/download/)

## Getting Started

1. **Copy this template** to your project directory:
   ```bash
   cp templates/jbang/HelloToolkitApp.java my-app.java
   ```

2. **Run the application directly**:
   ```bash
   jbang my-app.java
   ```

   Or make it executable and run:
   ```bash
   chmod +x my-app.java
   ./my-app.java
   ```

   you can also run it with `jbang run --debug my-app.java` to attach a debugger.

## TamboUI Version

The template uses `LATEST` version which will resolve to the latest snapshot. To use a specific version
replace `LATEST` with the specific version in the `//DEPS` lines.

## IDE Support

JBang files work well in IDEs:
- **IntelliJ IDEA**: Install the JBang plugin for syntax highlighting and dependency resolution
- **VS Code**: Install the JBang extension

## Learn More

- [JBang Documentation](https://www.jbang.dev/documentation/)
- [TamboUI Documentation](https://tamboui.dev)
