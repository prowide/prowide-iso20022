
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
 * Class for seev.038.001.08 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnNrrtv"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.038.001.08")
public class MxSeev03800108
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnNrrtv", required = true)
    protected CorporateActionNarrativeV08 corpActnNrrtv;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 38;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 8;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification10 .class, AccountIdentification48Choice.class, AccountIdentification59 .class, BalanceFormat11Choice.class, CorporateActionGeneralInformation92 .class, CorporateActionNarrative1Code.class, CorporateActionNarrative3Choice.class, CorporateActionNarrativeV08 .class, FinancialInstrumentQuantity33Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification78 .class, IdentificationSource3Choice.class, MxSeev03800108 .class, OtherIdentification1 .class, PartyIdentification127Choice.class, ProprietaryQuantity8 .class, Quantity48Choice.class, SafekeepingAccountIdentification1Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat28Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText6 .class, SecurityIdentification19 .class, ShortLong1Code.class, SignedQuantityFormat10 .class, SignedQuantityFormat11 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.038.001.08";

    public MxSeev03800108() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03800108(final String xml) {
        this();
        MxSeev03800108 tmp = parse(xml);
        corpActnNrrtv = tmp.getCorpActnNrrtv();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03800108(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnNrrtv property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNarrativeV08 }
     *     
     */
    public CorporateActionNarrativeV08 getCorpActnNrrtv() {
        return corpActnNrrtv;
    }

    /**
     * Sets the value of the corpActnNrrtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNarrativeV08 }
     *     
     */
    public MxSeev03800108 setCorpActnNrrtv(CorporateActionNarrativeV08 value) {
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
    public static MxSeev03800108 parse(String xml) {
        return ((MxSeev03800108) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03800108 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev03800108 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev03800108) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03800108 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03800108 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03800108) parserImpl.read(MxSeev03800108 .class, xml, _classes));
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
     * Creates an MxSeev03800108 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03800108 message
     * @return
     *     a new instance of MxSeev03800108
     */
    public static final MxSeev03800108 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03800108 .class);
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
