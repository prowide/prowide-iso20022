
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
 * Class for setr.066.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "invstmtFndCxlAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.066.001.01")
public class MxSetr06600101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "InvstmtFndCxlAdvc", required = true)
    protected InvestmentFundCancellationAdviceV01 invstmtFndCxlAdvc;
    public static final transient String BUSINESS_PROCESS = "setr";
    public static final transient int FUNCTIONALITY = 66;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference4 .class, AddressType2Code.class, Advice1Choice.class, AlternateSecurityIdentification3 .class, BICIdentification1 .class, CopyInformation2 .class, DateAndDateTimeChoice.class, Extension1 .class, FinancialInstrument18 .class, FinancialInstrumentQuantity1 .class, FinancialInstrumentQuantity2 .class, FinancialInstrumentQuantity3 .class, FundOrderType1Code.class, GenericIdentification1 .class, InvestmentAccount30 .class, InvestmentFundCancellationAdviceV01 .class, InvestmentFundOrderExecution3 .class, MessageIdentification1 .class, MxSetr06600101 .class, NameAndAddress5 .class, PartyIdentification2Choice.class, PostalAddress1 .class, RedemptionExecution11 .class, SecuritiesAccount5 .class, SecurityIdentification10Choice.class, SecurityIdentification9 .class, Statement9 .class, StatementType1Code.class, SubAccount3 .class, SubscriptionExecution8 .class, SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice.class, SwitchExecution5 .class, SwitchExecutionRedemptionLeg4 .class, SwitchExecutionSubscriptionLeg4 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:setr.066.001.01";

    public MxSetr06600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr06600101(final String xml) {
        this();
        MxSetr06600101 tmp = parse(xml);
        invstmtFndCxlAdvc = tmp.getInvstmtFndCxlAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr06600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the invstmtFndCxlAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentFundCancellationAdviceV01 }
     *     
     */
    public InvestmentFundCancellationAdviceV01 getInvstmtFndCxlAdvc() {
        return invstmtFndCxlAdvc;
    }

    /**
     * Sets the value of the invstmtFndCxlAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentFundCancellationAdviceV01 }
     *     
     */
    public MxSetr06600101 setInvstmtFndCxlAdvc(InvestmentFundCancellationAdviceV01 value) {
        this.invstmtFndCxlAdvc = value;
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
    public static MxSetr06600101 parse(String xml) {
        return ((MxSetr06600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr06600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr06600101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr06600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr06600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr06600101 parse(String xml, MxRead parserImpl) {
        return ((MxSetr06600101) parserImpl.read(MxSetr06600101 .class, xml, _classes));
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
     * Creates an MxSetr06600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr06600101 message
     * @return
     *     a new instance of MxSetr06600101
     */
    public static final MxSetr06600101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr06600101 .class);
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
