
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for seev.008.001.09 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mtgRsltDssmntn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.008.001.09")
public class MxSeev00800109
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MtgRsltDssmntn", required = true)
    protected MeetingResultDisseminationV09 mtgRsltDssmntn;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 8;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 9;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, CommunicationAddress11 .class, DateAndPlaceOfBirth2 .class, EligiblePosition16 .class, FinancialInstrumentQuantity18Choice.class, FinancialInstrumentQuantity45Choice.class, GenericIdentification13 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification78 .class, HoldingBalance11 .class, IdentificationSource3Choice.class, IdentificationType45Choice.class, ItemDescription2 .class, MeetingReference10 .class, MeetingResultDisseminationV09 .class, MeetingType4Code.class, MeetingTypeClassification2Choice.class, MeetingTypeClassification2Code.class, MxSeev00800109 .class, NameAndAddress5 .class, NamePrefix2Code.class, NaturalPersonIdentification1 .class, NotificationType2Code.class, OtherIdentification1 .class, Pagination1 .class, Participation5 .class, PartyIdentification129Choice.class, PartyIdentification198Choice.class, PartyIdentification221 .class, PartyIdentification231Choice.class, PartyIdentification238 .class, PartyIdentification246Choice.class, PartyIdentification250 .class, PartyIdentification269 .class, PersonName2 .class, PersonName3 .class, PostalAddress1 .class, PostalAddress26 .class, ProprietaryVote2 .class, ResolutionStatus2Code.class, ResolutionSubStatus1Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat28Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText6 .class, SecuritiesEntryType2Code.class, SecurityIdentification19 .class, SecurityPosition19 .class, ShortLong1Code.class, SignedQuantityFormat14 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TypeOfIdentification4Code.class, Vote20 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.008.001.09";

    public MxSeev00800109() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev00800109(final String xml) {
        this();
        MxSeev00800109 tmp = parse(xml);
        mtgRsltDssmntn = tmp.getMtgRsltDssmntn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev00800109(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mtgRsltDssmntn property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingResultDisseminationV09 }
     *     
     */
    public MeetingResultDisseminationV09 getMtgRsltDssmntn() {
        return mtgRsltDssmntn;
    }

    /**
     * Sets the value of the mtgRsltDssmntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingResultDisseminationV09 }
     *     
     */
    public MxSeev00800109 setMtgRsltDssmntn(MeetingResultDisseminationV09 value) {
        this.mtgRsltDssmntn = value;
        return this;
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
    public static MxSeev00800109 parse(String xml) {
        return ((MxSeev00800109) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev00800109 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev00800109 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev00800109) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev00800109 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev00800109 parse(String xml, MxRead parserImpl) {
        return ((MxSeev00800109) parserImpl.read(MxSeev00800109 .class, xml, _classes));
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
     * Creates an MxSeev00800109 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev00800109 message
     * @return
     *     a new instance of MxSeev00800109
     */
    public final static MxSeev00800109 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev00800109 .class);
    }

}
