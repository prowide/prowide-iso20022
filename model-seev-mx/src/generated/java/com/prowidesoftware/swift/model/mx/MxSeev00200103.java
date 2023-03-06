
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for seev.002.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mtgCxl"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.002.001.03")
public class MxSeev00200103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MtgCxl", required = true)
    protected MeetingCancellationV03 mtgCxl;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 2;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, AddressType2Code.class, AlternateIdentification1 .class, AmendInformation1 .class, EligiblePosition3 .class, GenericIdentification1 .class, GenericIdentification13 .class, GenericIdentification5 .class, HoldingBalance6 .class, IdentificationSource1Choice.class, MeetingCancellationReason1Choice.class, MeetingCancellationReason2 .class, MeetingCancellationReason2Code.class, MeetingCancellationV03 .class, MeetingReference5 .class, MeetingType2Code.class, MeetingTypeClassification1Choice.class, MeetingTypeClassification1Code.class, MessageIdentification.class, MessageIdentification1 .class, MxSeev00200103 .class, NameAndAddress5 .class, PartyIdentification3 .class, PartyIdentification9Choice.class, PostalAddress1 .class, SafekeepingPlace1Code.class, SafekeepingPlaceAsCodeAndPartyIdentification.class, SafekeepingPlaceFormatChoice.class, SecuritiesEntryType2Code.class, SecurityIdentification11 .class, SecurityIdentification11Choice.class, SecurityPosition6 .class, UnitOrFaceAmount1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.002.001.03";

    public MxSeev00200103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev00200103(final String xml) {
        this();
        MxSeev00200103 tmp = parse(xml);
        mtgCxl = tmp.getMtgCxl();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev00200103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mtgCxl property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingCancellationV03 }
     *     
     */
    public MeetingCancellationV03 getMtgCxl() {
        return mtgCxl;
    }

    /**
     * Sets the value of the mtgCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingCancellationV03 }
     *     
     */
    public MxSeev00200103 setMtgCxl(MeetingCancellationV03 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxSeev00200103 parse(String xml) {
        return ((MxSeev00200103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev00200103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev00200103 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev00200103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev00200103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev00200103 parse(String xml, MxRead parserImpl) {
        return ((MxSeev00200103) parserImpl.read(MxSeev00200103 .class, xml, _classes));
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
     * Creates an MxSeev00200103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev00200103 message
     * @return
     *     a new instance of MxSeev00200103
     */
    public final static MxSeev00200103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev00200103 .class);
    }

}
