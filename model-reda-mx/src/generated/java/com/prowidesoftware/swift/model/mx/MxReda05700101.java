
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
 * Class for reda.057.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "stgSttlmInstrDeltn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.057.001.01")
public class MxReda05700101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "StgSttlmInstrDeltn", required = true)
    protected StandingSettlementInstructionDeletionV01 stgSttlmInstrDeltn;
    public final static transient String BUSINESS_PROCESS = "reda";
    public final static transient int FUNCTIONALITY = 57;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification26 .class, AddressType2Code.class, ClassificationType1Choice.class, EffectiveDate1 .class, GenericIdentification1 .class, MarketIdentification87 .class, MarketIdentificationOrCashPurpose1Choice.class, MxReda05700101 .class, NameAndAddress5 .class, PartyIdentification63 .class, PartyIdentification75Choice.class, PartyOrCurrency1Choice.class, PostalAddress1 .class, Purpose3Choice.class, SimpleIdentificationInformation4 .class, StandingSettlementInstructionDeletionV01 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.057.001.01";

    public MxReda05700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda05700101(final String xml) {
        this();
        MxReda05700101 tmp = parse(xml);
        stgSttlmInstrDeltn = tmp.getStgSttlmInstrDeltn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda05700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the stgSttlmInstrDeltn property.
     * 
     * @return
     *     possible object is
     *     {@link StandingSettlementInstructionDeletionV01 }
     *     
     */
    public StandingSettlementInstructionDeletionV01 getStgSttlmInstrDeltn() {
        return stgSttlmInstrDeltn;
    }

    /**
     * Sets the value of the stgSttlmInstrDeltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingSettlementInstructionDeletionV01 }
     *     
     */
    public MxReda05700101 setStgSttlmInstrDeltn(StandingSettlementInstructionDeletionV01 value) {
        this.stgSttlmInstrDeltn = value;
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
    public static MxReda05700101 parse(String xml) {
        return ((MxReda05700101) MxReadImpl.parse(MxReda05700101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda05700101 parse(String xml, MxRead parserImpl) {
        return ((MxReda05700101) parserImpl.read(MxReda05700101 .class, xml, _classes));
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
     * Creates an MxReda05700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda05700101 message
     * @return
     *     a new instance of MxReda05700101
     */
    public final static MxReda05700101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda05700101 .class);
    }

}
