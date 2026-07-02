
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
 * Class for seev.003.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mtgEntitlmntNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.003.001.03")
public class MxSeev00300103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MtgEntitlmntNtfctn", required = true)
    protected MeetingEntitlementNotificationV03 mtgEntitlmntNtfctn;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 3;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, AddressType2Code.class, AlternateIdentification1 .class, EligibilityDates1 .class, EligiblePosition3 .class, GenericIdentification1 .class, GenericIdentification13 .class, GenericIdentification5 .class, HoldingBalance6 .class, IdentificationSource1Choice.class, MeetingEntitlementNotificationV03 .class, MeetingReference4 .class, MeetingType2Code.class, MeetingTypeClassification1Choice.class, MeetingTypeClassification1Code.class, MessageIdentification.class, MessageIdentification1 .class, MxSeev00300103 .class, NameAndAddress5 .class, PartyIdentification3 .class, PartyIdentification9Choice.class, PostalAddress1 .class, SafekeepingPlace1Code.class, SafekeepingPlaceAsCodeAndPartyIdentification.class, SafekeepingPlaceFormatChoice.class, SecuritiesEntryType2Code.class, SecurityIdentification11 .class, SecurityIdentification11Choice.class, SecurityPosition6 .class, UnitOrFaceAmount1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.003.001.03";

    public MxSeev00300103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev00300103(final String xml) {
        this();
        MxSeev00300103 tmp = parse(xml);
        mtgEntitlmntNtfctn = tmp.getMtgEntitlmntNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev00300103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mtgEntitlmntNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingEntitlementNotificationV03 }
     *     
     */
    public MeetingEntitlementNotificationV03 getMtgEntitlmntNtfctn() {
        return mtgEntitlmntNtfctn;
    }

    /**
     * Sets the value of the mtgEntitlmntNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingEntitlementNotificationV03 }
     *     
     */
    public MxSeev00300103 setMtgEntitlmntNtfctn(MeetingEntitlementNotificationV03 value) {
        this.mtgEntitlmntNtfctn = value;
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
    public static MxSeev00300103 parse(String xml) {
        return ((MxSeev00300103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev00300103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev00300103 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev00300103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev00300103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev00300103 parse(String xml, MxRead parserImpl) {
        return ((MxSeev00300103) parserImpl.read(MxSeev00300103 .class, xml, _classes));
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
     * Creates an MxSeev00300103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev00300103 message
     * @return
     *     a new instance of MxSeev00300103
     */
    public final static MxSeev00300103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev00300103 .class);
    }

}
