![alt tag](http://www.prowidesoftware.com/img/logoPW_800x253-300dpi.jpg)


**Prowide ISO 20022** is an open source Java framework for managing **ISO 20022** messages.

This project is a complement for the **Prowide Core** library: https://github.com/prowide/prowide-core

### What's included?

* **Java model** for ISO 20022 MX (for example: pacs.008.001.02, for all ISO 20022 message categories and types)
* **Parser** from ISO 20022 XML into Java
* **Builder** API from Java to ISO 20022 XML
* Conversion to/from **JSON**

For SWIFT messages validation, restricted ISO versions (such as SEPA, CBPR+, TARGET), GUI application and more, please check our complementary commercial offerings at https://www.prowidesoftware.com/

### Documentation
* Documentation site https://www.prowidesoftware.com/resources
* Javadoc https://www.javadoc.io/doc/com.prowidesoftware/pw-iso20022/
* Code examples https://github.com/prowide/prowide-iso20022-examples

### Distribution
This repository exposes the **source code for the maintenance and LTS yearly releases**. 
Latest public **binary DOWNLOAD** is available at https://www.prowidesoftware.com/download

SRU updates are made available on October (one month before SWIFT production date) for the general public, and 6 months in advance for subscribed customers.

### License

Apache License 2.0

SWIFT is a trademark of S.W.I.F.T. SCRL. (www.swift.com)

### Build

The projects uses https://github.com/prowide/prowide-core as included build, so in order to build the library you need 
to clone the Prowide Core repository as well.

For better build performance local configurations can be setup in a gradle.properties file such as:
```
org.gradle.jvmargs=-Xms512m -Xmx7g
org.gradle.parallel=true
```

Run `./gradlew idea` or `./gradlew eclipse` to generate local settings and reload the project in your IDE

To compile and test all modules:
`./gradlew build`

### Modules

The project is huge because it contains the cmoplete set of jaxb generated the project is divided into multiple subprojects though as follows:
* iso20022-core: main common code and base classes for all modules, including API for headers
* model-common-types: common business types dictionary for many message categories
* model-[category]-mx: the Document classes for each specific category (entry point for each message type)
* model-[category]-types: business types dictionary for each specific category

The dependencies being:
```
iso20022-core
  \-- model-common-types
model-[category]-types
  \-- model-common-types
model-[category]-mx
  +-- iso20022-core
  +-- model-[category]-types
  \-- model-common-types
```

### Artifacts

The root project creates an uber jar named **pw-iso20022-SRUYYYY-version.jar** with the library API for all ISO20022
message categories: pacs, camt, xsys, sese, etc... So if you need to process many different message types or you 
want to keep your dependencies simple, you can just take the single jar output. This is also the jar published in
**Maven Central**.

If instead of depending on the uber jar you want to have a subset of the library for some message types you can just 
take the base and common jars and the specific category modules. For instance to use ony the pacs and camt messages, you need:
* iso20022-core -> `pw-iso20022-core-SRUYYYY-version.jar`
* model-common-types -> `pw-iso20022-common-types-SRUYYYY-version.jar`
* model-pacs-mx -> `pw-iso20022-pacs-mx-SRUYYYY-version.jar`
* model-pacs-types -> `pw-iso20022-pacs-types-SRUYYYY-version.jar`
* model-camt-mx -> `pw-iso20022-camt-mx-SRUYYYY-version.jar`
* model-camt-types -> `pw-iso20022-camt-types-SRUYYYY-version.jar` 


