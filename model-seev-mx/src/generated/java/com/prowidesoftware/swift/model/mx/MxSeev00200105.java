
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
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for seev.002.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mtgCxl"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.002.001.05")
public class MxSeev00200105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MtgCxl", required = true)
    protected MeetingCancellationV05 mtgCxl;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 2;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, AddressType2Code.class, EligiblePosition5 .class, GenericIdentification13 .class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification21 .class, HoldingBalance7 .class, IdentificationSource3Choice.class, MeetingCancellationReason1Choice.class, MeetingCancellationReason2 .class, MeetingCancellationReason2Code.class, MeetingCancellationV05 .class, MeetingReference6 .class, MeetingType3Code.class, MeetingTypeClassification1Choice.class, MeetingTypeClassification1Code.class, MxSeev00200105 .class, NameAndAddress5 .class, OtherIdentification1 .class, PartyIdentification40Choice.class, PostalAddress1 .class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat2Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText2 .class, SecuritiesEntryType2Code.class, SecurityIdentification14 .class, SecurityPosition8 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, UnitOrFaceAmount1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.002.001.05";

    public MxSeev00200105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev00200105(final String xml) {
        this();
        MxSeev00200105 tmp = parse(xml);
        mtgCxl = tmp.getMtgCxl();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev00200105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mtgCxl property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingCancellationV05 }
     *     
     */
    public MeetingCancellationV05 getMtgCxl() {
        return mtgCxl;
    }

    /**
     * Sets the value of the mtgCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingCancellationV05 }
     *     
     */
    public MxSeev00200105 setMtgCxl(MeetingCancellationV05 value) {
        this.mtgCxl = value;
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxSeev00200105 parse(String xml) {
        return ((MxSeev00200105) MxReadImpl.parse(MxSeev00200105 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev00200105 parse(String xml, MxRead parserImpl) {
        return ((MxSeev00200105) parserImpl.read(MxSeev00200105 .class, xml, _classes));
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
     * Creates an MxSeev00200105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev00200105 message
     * @return
     *     a new instance of MxSeev00200105
     */
    public final static MxSeev00200105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev00200105 .class);
    }

}
