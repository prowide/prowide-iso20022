
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
 * Class for seev.019.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "agtCAMvmntInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.019.001.01")
public class MxSeev01900101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AgtCAMvmntInstr", required = true)
    protected AgentCAMovementInstructionV01 agtCAMvmntInstr;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 19;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification2Choice.class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AgentCAMovementInstructionV01 .class, AlternateSecurityIdentification3 .class, CashAccount19 .class, CashMovement2 .class, CashProceeds1 .class, CorporateActionEventProcessingType1Code.class, CorporateActionEventProcessingType1FormatChoice.class, CorporateActionEventType2Code.class, CorporateActionEventType2FormatChoice.class, CorporateActionInformation1 .class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionMandatoryVoluntary1FormatChoice.class, CorporateActionMovement1 .class, CorporateActionOption1FormatChoice.class, CorporateActionOptionType1Code.class, CreditDebitCode.class, DistributionInstructionType1Code.class, DocumentIdentification8 .class, FinancialInstrumentDescription3 .class, ForeignExchangeTerms9 .class, FormOfSecurity1Code.class, GenericIdentification1 .class, GenericIdentification13 .class, MxSeev01900101 .class, NameAndAddress5 .class, PartyIdentification2Choice.class, PostalAddress1 .class, PriceValue1 .class, ProceedsMovement1 .class, SecuritiesAccount10 .class, SecuritiesAccount8 .class, SecuritiesBalanceType10Code.class, SecuritiesBalanceType10FormatChoice.class, SecuritiesBalanceType9Code.class, SecuritiesBalanceType9FormatChoice.class, SecuritiesProceeds1 .class, SecurityIdentification7 .class, StampDutyType1Code.class, StampDutyType1FormatChoice.class, TaxVoucher1 .class, UnderlyingSecurityMovement1 .class, UnitOrFaceAmount1Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.019.001.01";

    public MxSeev01900101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev01900101(final String xml) {
        this();
        MxSeev01900101 tmp = parse(xml);
        agtCAMvmntInstr = tmp.getAgtCAMvmntInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev01900101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the agtCAMvmntInstr property.
     * 
     * @return
     *     possible object is
     *     {@link AgentCAMovementInstructionV01 }
     *     
     */
    public AgentCAMovementInstructionV01 getAgtCAMvmntInstr() {
        return agtCAMvmntInstr;
    }

    /**
     * Sets the value of the agtCAMvmntInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentCAMovementInstructionV01 }
     *     
     */
    public MxSeev01900101 setAgtCAMvmntInstr(AgentCAMovementInstructionV01 value) {
        this.agtCAMvmntInstr = value;
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
    public static MxSeev01900101 parse(String xml) {
        return ((MxSeev01900101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev01900101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev01900101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev01900101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev01900101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev01900101 parse(String xml, MxRead parserImpl) {
        return ((MxSeev01900101) parserImpl.read(MxSeev01900101 .class, xml, _classes));
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
     * Creates an MxSeev01900101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev01900101 message
     * @return
     *     a new instance of MxSeev01900101
     */
    public static final MxSeev01900101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev01900101 .class);
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
