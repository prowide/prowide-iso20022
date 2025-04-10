
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for seev.008.001.08 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mtgRsltDssmntn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.008.001.08")
public class MxSeev00800108
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MtgRsltDssmntn", required = true)
    protected MeetingResultDisseminationV08 mtgRsltDssmntn;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 8;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 8;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AddressType2Code.class, CommunicationAddress11 .class, DateAndPlaceOfBirth2 .class, EligiblePosition16 .class, FinancialInstrumentQuantity18Choice.class, FinancialInstrumentQuantity45Choice.class, GenericIdentification13 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification78 .class, HoldingBalance11 .class, IdentificationSource3Choice.class, IdentificationType45Choice.class, ItemDescription1 .class, MeetingReference10 .class, MeetingResultDisseminationV08 .class, MeetingType4Code.class, MeetingTypeClassification2Choice.class, MeetingTypeClassification2Code.class, MxSeev00800108 .class, NameAndAddress5 .class, NamePrefix2Code.class, NaturalPersonIdentification1 .class, NotificationType2Code.class, OtherIdentification1 .class, Pagination1 .class, Participation5 .class, PartyIdentification129Choice.class, PartyIdentification198Choice.class, PartyIdentification221 .class, PartyIdentification231Choice.class, PartyIdentification238 .class, PartyIdentification246Choice.class, PartyIdentification250 .class, PartyIdentification269 .class, PersonName2 .class, PersonName3 .class, PostalAddress1 .class, PostalAddress26 .class, ProprietaryVote2 .class, ResolutionStatus2Code.class, ResolutionSubStatus1Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat28Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText6 .class, SecuritiesEntryType2Code.class, SecurityIdentification19 .class, SecurityPosition19 .class, ShortLong1Code.class, SignedQuantityFormat14 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TypeOfIdentification4Code.class, Vote18 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.008.001.08";

    public MxSeev00800108() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev00800108(final String xml) {
        this();
        MxSeev00800108 tmp = parse(xml);
        mtgRsltDssmntn = tmp.getMtgRsltDssmntn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev00800108(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mtgRsltDssmntn property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingResultDisseminationV08 }
     *     
     */
    public MeetingResultDisseminationV08 getMtgRsltDssmntn() {
        return mtgRsltDssmntn;
    }

    /**
     * Sets the value of the mtgRsltDssmntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingResultDisseminationV08 }
     *     
     */
    public MxSeev00800108 setMtgRsltDssmntn(MeetingResultDisseminationV08 value) {
        this.mtgRsltDssmntn = value;
        return this;
    }

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxSeev00800108 parse(String xml) {
        return ((MxSeev00800108) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev00800108 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev00800108 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev00800108) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev00800108 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev00800108 parse(String xml, MxRead parserImpl) {
        return ((MxSeev00800108) parserImpl.read(MxSeev00800108 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxSeev00800108 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev00800108 message
     * @return
     *     a new instance of MxSeev00800108
     */
    public static final MxSeev00800108 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev00800108 .class);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
