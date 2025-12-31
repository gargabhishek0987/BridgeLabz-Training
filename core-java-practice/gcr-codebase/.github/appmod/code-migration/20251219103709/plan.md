# Migration Plan

- Session ID: 8ff95bca-037f-459b-a04a-984e3a9852f4
- Goal: Upgrade Java runtime to Java 21 (LTS)
- Created: 2025-12-19

## Detection Summary
- Java source files: detected (multiple `.java` files under `gcr-codebase/Programming-elements`)
- Build files: no `pom.xml` or `build.gradle` detected

## Detected JDKs on device
1. Java 1.8.0_202 — C:\Program Files\Java\jdk1.8.0_202\bin
2. Java 21.0.2 — C:\Users\Dell\.jdks\openjdk-21.0.2\bin  (selected)
3. Java 22 — C:\Users\Dell\.jdks\openjdk-22\bin
4. Java 22.0.1 — C:\Users\Dell\.jdks\openjdk-22.0.1\bin

## Build tool
- No Maven or Gradle build files detected; this is a plain Java source collection.
- Recommendation: either (A) set workspace `JAVA_HOME` to Java 21 and compile/run with local JDK, or (B) add a simple Maven/Gradle wrapper if you want reproducible builds and tooling.

## Chosen JDK settings
- Need to install new JDK: false
- Selected JAVA_HOME: C:\Users\Dell\.jdks\openjdk-21.0.2
- Reason: Java 21 is already installed and is the requested LTS target.

## Next steps (recommended)
1. Version control setup: handle uncommitted changes per VS Code setting `uncommittedChangesAction` = "Always Stash" and create branch `appmod/java-migration-20251219103709`.
2. If you want reproducible builds, add a `pom.xml` (Maven) or `build.gradle` (Gradle) and set Java version to 21.
3. Set `JAVA_HOME` to the selected JDK for local runs or CI.
4. Use tooling (#build_java_project, #run_tests_for_java) once a build system is present.

## Files to create/modify
- `.github/appmod/code-migration/20251219103709/plan.md` (this file)
- Optionally: `pom.xml` or `build.gradle` at project root


---

Save this plan and confirm if you want me to:
- A) Proceed to version control setup (auto-stash per policy) and create the migration branch, or
- B) Set `JAVA_HOME` in your environment for this workspace to Java 21, or
- C) Create a minimal Maven `pom.xml` to manage builds and set Java target to 21.
