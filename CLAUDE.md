 # CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

**Prowide ISO 20022** is an open source Java framework for managing ISO 20022 MX messages. This library provides:
- Java model for ISO 20022 MX messages (all categories: pacs, camt, pain, etc.)
- XML parser to Java objects
- Builder API from Java to XML
- JSON conversion support

This is a companion library to **Prowide Core** (https://github.com/prowide/prowide-core).

## Build Commands

### Full Build
```bash
./gradlew build
```
Compiles all modules, runs tests, and creates artifacts.

### Run Tests
```bash
./gradlew test
```
Runs all tests across all modules.

### Run Tests on Specific Module
```bash
./gradlew :iso20022-core:test
```
Replace `iso20022-core` with any module name.

### Run Single Test Class
```bash
./gradlew :iso20022-core:test --tests "ClassName"
```

### Clean Build
```bash
./gradlew clean build
```

### Generate Javadoc
```bash
./gradlew javadoc
```
Output: `build/docs/javadoc/`

### Create Individual Module JARs
```bash
./gradlew :iso20022-core:jar
./gradlew :model-pacs-mx:jar
./gradlew :model-camt-mx:jar
# etc.
```

### Spotless (Code Formatting)
```bash
./gradlew spotlessCheck
./gradlew spotlessApply
```
Only applies to `iso20022-core` module.

## Architecture

### Multi-Module Structure

The project uses a modular architecture with **70+ Gradle subprojects** organized by ISO 20022 message category:

```
iso20022-core              → Core API, parsers, utilities, base classes (HAND-WRITTEN CODE)
model-common-types         → Common business type dictionary (GENERATED CODE)
model-[category]-mx        → Document/message classes for each category (GENERATED CODE)
model-[category]-types     → Business type dictionaries specific to each category (GENERATED CODE)
```

**CRITICAL:** Only `iso20022-core` contains hand-written code. **ALL other 70+ subprojects are JAXB-generated from XSD schemas.**

**Module Dependencies:**
- `model-[category]-mx` depends on: `iso20022-core`, `model-[category]-types`, `model-common-types`
- `model-[category]-types` depends on: `model-common-types`
- `iso20022-core` depends on: `pw-swift-core` (from Prowide Core)

### Source Structure

**`iso20022-core` module:**
```
src/main/java       → Hand-written API code (MODIFY HERE)
src/test/java       → Hand-written tests
```

**All other modules (model-*):**
```
src/generated/java  → JAXB-generated code from XSD schemas (DO NOT MODIFY)
```

**IMPORTANT:**
- Never modify files in `src/generated/java` or any code in `model-*` modules
- These are auto-generated from ISO 20022 XSD schemas and will be overwritten
- You can **analyze specific files** in generated modules to understand message structure
- **Never load entire generated modules as context** - there are thousands of generated classes

### Core Components

**In `iso20022-core` module:**

- `AbstractMX` → Base class for all MX messages, handles parsing/serialization
- `MxParseUtils` → Fast SAX-based XML parsing utilities (no DOM)
- `MxWriteUtils` → XML serialization utilities
- `AppHdr` / `AppHdrFactory` → Business Application Header handling (versions 1-4)
- `MxReadConfiguration` / `MxWriteConfiguration` → Customizable parsing/serialization settings
- Adapters (in `adapters/` package) → JAXB adapters for datetime, date, time serialization

**Message Structure:**
- Each MX message consists of: optional `AppHdr` (header) + `Document` (payload)
- Document classes are in `model-[category]-mx` modules (e.g., `MxPacs00800102`)
- Each message type follows pattern: `Mx{Category}{MessageType}{Version}` (e.g., `MxPacs00800102` = pacs.008.001.02)

### Key Patterns

1. **No Entity Exposure:** DTOs and projections are used, never expose JAXB entities directly in public APIs
2. **JAXB-based:** Uses Jakarta XML Binding (JAXB 4.x) for XML marshalling/unmarshalling
3. **Metadata Extraction:** `MxSwiftMessage` interface provides hooks for extracting sender, receiver, amounts, dates
4. **Customizable Serialization:** Escape handlers, datetime adapters, namespace configurations all pluggable

## Test Infrastructure

- **Framework:** JUnit 5 + AssertJ
- **XML Assertions:** XMLUnit for comparing XML structures
- **Location:** Tests are only in `iso20022-core/src/test/java`
- **Coverage:** Unit tests for parsers, serializers, adapters, utilities

## Important Constraints

### Code Generation
- **Only `iso20022-core` is hand-written** - all other 70+ modules are JAXB-generated from XSD schemas
- **Never propose changes to generated code** - it will be overwritten on next schema update
- Analyze specific generated files when needed, but never load entire modules as context (too many classes)
- All development and fixes should be done in `iso20022-core` module

### JAXB/XML
- Uses **Jakarta XML Binding 4.x** (not javax)
- Requires Java 11+ (toolchain configured)
- Custom datetime adapters handle ISO 8601 with milliseconds (3 digits)

### Versioning
- Uses **Axion Release Plugin** for Git-based versioning
- Version format: `SRU{YEAR}-{semantic-version}` (e.g., `SRU2024-10.2.9`)
- **SRU** (Standards Release Update) tracks SWIFT's annual schema releases
- Always update `CHANGELOG.md` with functional, concise entries

### Build Performance
- **Very large codebase** - full build can be slow
- Use module-specific tasks when possible: `./gradlew :iso20022-core:build`
- Gradle parallel execution recommended (set in `gradle.properties`)

### Javadoc
- Only **subset of modules** included in Javadoc (see `projectsIncludedInJavadoc` in build.gradle)
- Most `-types` and `-mx` modules have `javadoc.enabled = false`
- Add `@since` tags with version from CHANGELOG.md for new public API
- Use `@see` to avoid duplication
- No `@author` tags

## Dependencies

- **Prowide Core:** `pw-swift-core` (companion library)
- **JAXB:** `jaxb-impl:4.0.5` (Jakarta)
- **JSON:** `gson:2.11.0`
- **Utils:** `commons-lang3:3.17.0`
- **Test:** JUnit 5, AssertJ, XMLUnit, Guava (test only)

## Distribution

- **Uber JAR:** Root project creates `pw-iso20022-SRU{YEAR}-{version}.jar` containing all modules
- **Individual JARs:** Each module creates `pw-iso20022-{module-name}-SRU{YEAR}-{version}.jar`
- **Maven Central:** Published as `com.prowidesoftware:pw-iso20022`
- **Nexus Repository:** Internal releases/snapshots for licensed products

## Java Version

- **Source/Target:** Java 11
- **Toolchain:** Configured to use Java 11 (`.java-version` file)
- **Testing:** Can test on Java 17/21 with `testOn17` and `testOn21` tasks