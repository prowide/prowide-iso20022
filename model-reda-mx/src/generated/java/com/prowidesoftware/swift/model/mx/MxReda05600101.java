
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
 * Class for reda.056.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "stgSttlmInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.056.001.01")
public class MxReda05600101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "StgSttlmInstr", required = true)
    protected StandingSettlementInstructionV01 stgSttlmInstr;
    public final static transient String BUSINESS_PROCESS = "reda";
    public final static transient int FUNCTIONALITY = 56;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification26 .class, AddressType2Code.class, CashParties24 .class, ClassificationType1Choice.class, EffectiveDate1 .class, GenericIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification49 .class, MarketIdentification87 .class, MarketIdentificationOrCashPurpose1Choice.class, MxReda05600101 .class, NameAndAddress5 .class, NameAndAddress8 .class, PartyIdentification44 .class, PartyIdentification62 .class, PartyIdentification63 .class, PartyIdentification64 .class, PartyIdentification71Choice.class, PartyIdentification75Choice.class, PartyIdentification99Choice.class, PartyIdentificationAndAccount95 .class, PartyIdentificationAndAccount96 .class, PartyIdentificationAndAccount97 .class, PostalAddress1 .class, Purpose3Choice.class, SecuritiesAccount22 .class, SecuritiesOrCash1Choice.class, SettlementParties32 .class, SettlementParties35 .class, SimpleIdentificationInformation4 .class, StandingSettlementInstructionV01 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.056.001.01";

    public MxReda05600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda05600101(final String xml) {
        this();
        MxReda05600101 tmp = parse(xml);
        stgSttlmInstr = tmp.getStgSttlmInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda05600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the stgSttlmInstr property.
     * 
     * @return
     *     possible object is
     *     {@link StandingSettlementInstructionV01 }
     *     
     */
    public StandingSettlementInstructionV01 getStgSttlmInstr() {
        return stgSttlmInstr;
    }

    /**
     * Sets the value of the stgSttlmInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingSettlementInstructionV01 }
     *     
     */
    public MxReda05600101 setStgSttlmInstr(StandingSettlementInstructionV01 value) {
        this.stgSttlmInstr = value;
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
    public static MxReda05600101 parse(String xml) {
        return ((MxReda05600101) MxReadImpl.parse(MxReda05600101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda05600101 parse(String xml, MxRead parserImpl) {
        return ((MxReda05600101) parserImpl.read(MxReda05600101 .class, xml, _classes));
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
     * Creates an MxReda05600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda05600101 message
     * @return
     *     a new instance of MxReda05600101
     */
    public final static MxReda05600101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda05600101 .class);
    }

}
