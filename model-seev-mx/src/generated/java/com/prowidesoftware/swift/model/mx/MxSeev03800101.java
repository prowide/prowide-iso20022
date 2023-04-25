
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
 * Class for seev.038.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnNrrtv"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.038.001.01")
public class MxSeev03800101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnNrrtv", required = true)
    protected CorporateActionNarrativeV01 corpActnNrrtv;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 38;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification10 .class, AccountIdentification7 .class, AccountIdentification9Choice.class, AddressType2Code.class, AlternateIdentification1 .class, BalanceFormat1Choice.class, CopyDuplicate1Code.class, CorporateActionGeneralInformation10 .class, CorporateActionNarrative1Choice.class, CorporateActionNarrative1Code.class, CorporateActionNarrativeV01 .class, DateAndDateTimeChoice.class, DocumentIdentification11 .class, Extension2 .class, ExtensionEnvelope1 .class, FinancialInstrumentQuantity1Choice.class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification21 .class, IdentificationSource1Choice.class, MxSeev03800101 .class, NameAndAddress5 .class, PartyIdentification10Choice.class, PartyIdentification13Choice.class, PostalAddress1 .class, ProprietaryQuantity2 .class, Quantity2Choice.class, SafekeepingAccountIdentification1Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat2Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText2 .class, SecurityIdentification11 .class, SecurityIdentification11Choice.class, ShortLong1Code.class, SignedQuantityFormat1 .class, SignedQuantityFormat2 .class, UnderlyingSecurity1 .class, UpdatedAdditionalInformation2 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.038.001.01";

    public MxSeev03800101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03800101(final String xml) {
        this();
        MxSeev03800101 tmp = parse(xml);
        corpActnNrrtv = tmp.getCorpActnNrrtv();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03800101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnNrrtv property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNarrativeV01 }
     *     
     */
    public CorporateActionNarrativeV01 getCorpActnNrrtv() {
        return corpActnNrrtv;
    }

    /**
     * Sets the value of the corpActnNrrtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNarrativeV01 }
     *     
     */
    public MxSeev03800101 setCorpActnNrrtv(CorporateActionNarrativeV01 value) {
        this.corpActnNrrtv = value;
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
    public static MxSeev03800101 parse(String xml) {
        return ((MxSeev03800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev03800101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev03800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03800101 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03800101) parserImpl.read(MxSeev03800101 .class, xml, _classes));
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
     * Creates an MxSeev03800101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03800101 message
     * @return
     *     a new instance of MxSeev03800101
     */
    public static final MxSeev03800101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03800101 .class);
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
