![alt tag](http://www.prowidesoftware.com/img/logoPW_800x253-300dpi.jpg)


**Prowide ISO 20022** is an open source Java framework for managing **ISO 20022** messages.

This project is a complement for the **Prowide Core** library: https://github.com/prowide/prowide-core

### What's included?

* **Java model** for ISO 20022 MX (for example: pacs.008.001.02, for all ISO 20022 message categories and types)
* **Parser** from ISO 20022 XML into Java
* **Builder** API from Java to ISO 20022 XML
* Conversion to/from **JSON**

For SWIFT messages validation, restricted ISO versions (such as SEPA, CBPR+, TARGET), GUI application and more, please check our complementary commercial offerings at http://www.prowidesoftware.com/

### Documentation
* Documentation site http://www.prowidesoftware.com/resources
* Changelog http://www.prowidesoftware.com/resources/changelog
* Code examples https://github.com/prowide/prowide-core-examples

### Distribution
This repository exposes the **source code for the maintenance and LTS yearly releases**. 
Latest public **binary DOWNLOAD** is available at http://www.prowidesoftware.com/download-prowide-core

SRU updates are made available on October (one month before SWIFT production date) for the general public, and 6 months in advance for subscribed customers.

### License

Apache License 2.0

SWIFT is a trademark of S.W.I.F.T. SCRL. (www.swift.com)

### Build

* run "./gradlew eclipse" or "./gradlew idea" to generate your local IDE setup
* run "./gradlew build" to build the library
