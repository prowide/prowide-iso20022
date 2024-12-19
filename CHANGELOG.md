# Prowide ISO 20022 - CHANGELOG
 
#### 9.4.8 - SNAPSHOT
  * (PW-2113) Added API in the `MxParseUtils` to extract comments from XML string
  * (PW-2113) Added API in the `MxParseUtils` to extract the enclosed MT from a multi-format MX message
 
#### 9.4.7 - August 2024
  * (PW-1958) Fixed the `DefaultMxMetadataStrategy` NPE issue when the amount values are null

#### 9.5.4 - August 2024
  * (PW-1958) Fixed the `DefaultMxMetadataStrategy` NPE issue when the amount values are null

#### 9.5.3 - August 2024
  * (PW-1947) Updated MX model with latest SWIFT SRU2024 schema update, including new messages such as trck.001.001.03
  * Add support for Business Application Header version head.001.001.04

#### 9.5.2 - June 2024
  * (PW-1875) Fixed the `ZuluDateTimeAdapter` to convert the datetime to UTC offset if needed

#### 9.5.1 - June 2024
  * Enhanced the AppHdrFactory to honor the business service set in the parameter MxId
  * Enhanced the MxParseUtils#identifyMessage to set the business service in the MxId when present

#### 9.5.0 - May 2024
  * SWIFT Standard release update 2024 (live 16 November 2024)
  * Yearly revision of deprecation phase (see https://dev.prowidesoftware.com/SRU2024/getting-started/deprecation/)
  * Added message categories for File Management (cafm), Fraud Reporting and Disposition (cafm), Network Management (canm), and Settlement Reporting (casr)
  * Add support in the MxWriteConfiguration to use standard envelopes for SWIFT and ISO 20022
  * Changed the default Document prefix to the message category; "camt", "pacs", etc...
  * Enhanced MxId with optional and transient businessService field to act as a message type discriminator
  * Dependency update: commons-lang3 -> 3.14.0
  * Dependency update: gson -> 2.11.0

#### 9.4.5 - May 2024
  * (PW-1875) Changed the BusinessApplicationHeaderV01 marshaller to always use Zulu timezone with "Z" indicator
 
#### 9.4.4 - January 2024
  * Enhanced the identifier extraction of the MxSwiftMessage to use the AppHdr when the Document namespace is missing
  * Enhanced the generic AbstractMX#parse to detect the message type from the AppHdr when the Document namespace is missing
  * Added default metadata extraction implementation for pacs and camt amounts and value dates
  * Added default methods for sender, receiver, and identifier extraction to the MxSwiftMessage.
  * Replaced the DistinguishedName parse logic with proprietary util class from the Prowide Core library

#### 9.4.3 - August 2023
  * Enhanced metadata extraction for xsys messages getting sender/receiver BICs from the RequestHeader element
  * Make the message metadata extraction lenient, by fixing the XML instruction of the payload when it contains invalid case

#### 9.4.2 - July 2023
  * Added new utility class SupplementaryDataUtils to facilitate "SplmtryData" extraction from MX messages

#### 9.4.1 - June 2023
  * (PW-1392) Fixed the default escape handler when serializing model objects into XML, that was duplicated quote characters in the output

#### 9.4.0 - May 2023
  * SWIFT Standard release update 2023 (live 19 November 2023)
  * Yearly revision of deprecation phase (see https://dev.prowidesoftware.com/SRU2022/getting-started/deprecation/)

#### 9.3.6 - March 2023
  * (GH-74) Added a parameter in the MxWriteParams to define a custom indentation string to use when marshalling into XML

#### 9.3.5 - January 2023
  * Added an optional way to pass a JaxbContext instance to the parse and write methods

#### 9.3.4 - November 2022
  * (GH-63) Added message type versions in categories: acmt, admi, auth, caaa, camt, catm, fxtr, pacs, reda, seev, semt, sese, setr, supl and trck
  * Added new business process and messages for: caad, cafc, cain, casp
  * Removed obsolete trea (treasury) message types
  * Added model and support for the BusinessApplicationHeaderV03

#### 9.3.3 - October 2022
  * (PW-1082) Added support in the JaxbContextCache and its default implementation to create the context without the classes parameter

#### 9.3.2 - August 2022
  * (PW-922) Added a parameter in the MxReadParams used by the AbstractMX#parse to control the log verbosity when parsing unrecognized messages

#### 9.3.1 - August 2022
  * Added model for "trck" types
  
#### 9.3.0 - May 2022
  * SWIFT Standard release update 2022 (live 21 November 2022)
  * Yearly revision of deprecation phase (see http://www.prowidesoftware.com/resources/deprecation-policy)
  * Updated gson dependency to 2.9.0
  * (GH-45) Fixed Json serialization in Java 17

#### 9.2.6 - March 2022
  * (GH-36) Added customizable datetime, date and time adapter in the MxWriteConfiguration, MxReadConfiguration
  * Changed the default date time serialization to local time with UTC offset format YYYY-MM-DDThh:mm:ss[.sss]+/-hh:mm
  * Changed the default time serialization to local time with UTC offset format hh:mm:ss[.sss]+/-hh:mm
  * Encapsulated the serialization options in a DTO, when calling xml or message methods in AbstractMX and AppHdr
  * Validate.notNull -> Objects.requireNonNull

#### 9.2.5 - January 2022
  * (GH-37) Updated dependency: gson:2.8.8 -> gson:2.8.9

#### 9.2.4 - December 2021
  * Added com.prowidesoftware.iso20022 as automatic module name in the MANIFEST for JPMS support

#### 9.2.3 - October 2021
  * Updated dependency: Apache Commons Lang 3.8.1 -> 3.12.0
  * Updated dependency: Apache Commons Text 1.6 -> 1.9
  * Updated dependency: Gson 2.8.2 -> 2.8.8

#### 9.2.2 - October 2021
  * (PW-584) Enhanced the XML serialization to use localized line separators

#### 9.2.1 - June 2021
  * NamespaceReader utility class made public with method to extract namespaces from XML, or to check if an element exists
  * NamespaceAndElementFilter made public, used by the parser, handy to implement a validator
  * (GH-26) Fixed AppHdr JSON conversion with explicit new namespace field as discriminator
  * (GH-24) Added a new MxWriteConfiguration and EscapeHandler API to tweak the serialization into XML

#### 9.2.0 - May 2021
  * SWIFT Standard release update 2021 (live 22 November 2021)
  * Yearly revision of deprecation phase (see http://www.prowidesoftware.com/resources/deprecation-policy)

#### 9.1.6 - April 2021
  * (GH-17|PW-506) Enhanced the XML format in the serializing, spaces and line breaks
  * (GH-18) Fixed NPE in json serialization/deserialization of XMLGregorianCalendar fractional second
  * Added customizable strategies to set the MxSwiftMessage metadata fields: reference, main amount, value date, etc...

#### 9.1.5 - December 2020
  * (GH-8) (JR-428) Fixed parser to skip unbounded content such as the @XmlAnyElement(lax = true) elements used in many schemas for supplementary data

#### 9.1.4 - November 2020
  * Fixed javadoc jar

#### 9.1.3 - October 2020
  * Fixed pom file

#### 9.1.2 - October 2020
  * Added AppHdrType enum and AppHdrFactory method to create headers with the enum as parameter
  * Added targetNamespace method to the AbstractMX
  * Internal SCM refactor for OS release
  * Revamped the parser implementation with SAX to avoid custom namespace preprocessing
  * Added AppHdrParser utility class
  * Removed the CopyableTo implementation from the generated model
  * Change the generic AbstractMX#parse to throw runtime exception when XML parameter is blank or null (same semantic as Mx classes parse method)

#### 9.1.1 - September 2021
  * Removed blank lines in MX writer (marshalling)
  * Fixed generic AbstractMX parse for system messages (xsys)

#### 9.1.0 - May 2020
  * SWIFT Standard release update 2020 (live 22 November 2020)
  * Yearly revision of deprecation phase (see http://www.prowidesoftware.com/resources/deprecation-policy)

#### 9.0.1 - May 2021
  * Added a new extensible interface based model for the application headers: AppHdr
  * Added support for the ISO Business Application Header version 2: head.001.001.02

#### 9.0.0 - May 2020
  * ISO 20022 module extracted from Prowide Integrator to its own library, with its own version from now on