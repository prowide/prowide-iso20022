# Prowide ISO 20022 - CHANGELOG

#### 9.3.5-SNAPSHOT
  * Added DI support for JaxbContext


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