
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
 * Class for seev.038.002.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnNrrtv"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:seev.038.002.01")
public class MxSeev03800201
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnNrrtv", required = true)
    protected CorporateActionNarrative002V01 corpActnNrrtv;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 38;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification10 .class, AccountIdentification10Choice.class, AccountIdentification13 .class, AlternateIdentification2 .class, BalanceFormat2Choice.class, CopyDuplicate1Code.class, CorporateActionGeneralInformation18 .class, CorporateActionNarrative002V01 .class, CorporateActionNarrative1Code.class, CorporateActionNarrative2Choice.class, DateAndDateTimeChoice.class, DocumentIdentification16 .class, Extension2 .class, ExtensionEnvelope1 .class, FinancialInstrumentQuantity15Choice.class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification26 .class, IdentificationSource2Choice.class, MxSeev03800201 .class, NameAndAddress12 .class, PartyIdentification16Choice.class, PartyIdentification18Choice.class, ProprietaryQuantity4 .class, Quantity7Choice.class, SafekeepingAccountIdentification1Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat5Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText5 .class, SecurityIdentification12 .class, SecurityIdentification12Choice.class, ShortLong1Code.class, SignedQuantityFormat3 .class, SignedQuantityFormat4 .class, UnderlyingSecurity2 .class, UpdatedAdditionalInformation4 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:seev.038.002.01";

    public MxSeev03800201() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03800201(final String xml) {
        this();
        MxSeev03800201 tmp = parse(xml);
        corpActnNrrtv = tmp.getCorpActnNrrtv();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03800201(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnNrrtv property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNarrative002V01 }
     *     
     */
    public CorporateActionNarrative002V01 getCorpActnNrrtv() {
        return corpActnNrrtv;
    }

    /**
     * Sets the value of the corpActnNrrtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNarrative002V01 }
     *     
     */
    public MxSeev03800201 setCorpActnNrrtv(CorporateActionNarrative002V01 value) {
        this.corpActnNrrtv = value;
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
    public static MxSeev03800201 parse(String xml) {
        return ((MxSeev03800201) MxReadImpl.parse(MxSeev03800201 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03800201 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03800201) parserImpl.read(MxSeev03800201 .class, xml, _classes));
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
     * Creates an MxSeev03800201 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03800201 message
     * @return
     *     a new instance of MxSeev03800201
     */
    public final static MxSeev03800201 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03800201 .class);
    }

}
