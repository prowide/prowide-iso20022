
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
 * Class for sese.013.001.08 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "prtflTrfConf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.013.001.08")
public class MxSese01300108
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "PrtflTrfConf", required = true)
    protected PortfolioTransferConfirmationV08 prtflTrfConf;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 13;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 8;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account24 .class, Account25 .class, AccountIdentification4Choice.class, AccountIdentificationAndName5 .class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference7 .class, AdditionalReference8 .class, AdditionalReference9 .class, AddressType2Code.class, AllOtherCash1Code.class, AlternateSecurityIdentification7 .class, BusinessFlowType1Code.class, CashAccount201 .class, ClearingSystemMemberIdentification4Choice.class, ContactIdentification2 .class, CurrentYearType1Choice.class, DateAndDateTime2Choice.class, Extension1 .class, FinancialInstitutionIdentification15 .class, FinancialInstitutionIdentification9Choice.class, FinancialInstrument65 .class, GenderCode.class, GenericAccountIdentification1 .class, GenericIdentification1 .class, GenericIdentification47 .class, ISAPortfolio2Choice.class, ISATransfer28 .class, ISAType1Code.class, ISAYearsOfIssue5 .class, IdentificationSource1Choice.class, IndividualPerson8 .class, Intermediary41 .class, InvestmentFundRole2Code.class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MxSese01300108 .class, NameAndAddress5 .class, NamePrefix1Code.class, Organisation31 .class, PartyIdentification113 .class, PartyIdentification119Choice.class, PartyIdentification123 .class, PartyIdentification124 .class, PartyIdentification90Choice.class, PartyIdentification97Choice.class, PartyIdentificationAndAccount156 .class, PartyIdentificationAndAccount157 .class, PartyIdentificationAndAccount158 .class, Portfolio1 .class, PortfolioTransferConfirmationV08 .class, PostalAddress1 .class, PreviousYear1Choice.class, PreviousYear3 .class, Quantity43Choice.class, ReceivingPartiesAndAccount18 .class, ResidualCash1Code.class, Role4Choice.class, SecurityIdentification25Choice.class, SubAccount5 .class, SubscriptionInformation1 .class, TransferType1Code.class, UKTaxGroupUnit1Code.class, Unit10 .class, Unit9 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.013.001.08";

    public MxSese01300108() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese01300108(final String xml) {
        this();
        MxSese01300108 tmp = parse(xml);
        prtflTrfConf = tmp.getPrtflTrfConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese01300108(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the prtflTrfConf property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioTransferConfirmationV08 }
     *     
     */
    public PortfolioTransferConfirmationV08 getPrtflTrfConf() {
        return prtflTrfConf;
    }

    /**
     * Sets the value of the prtflTrfConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioTransferConfirmationV08 }
     *     
     */
    public MxSese01300108 setPrtflTrfConf(PortfolioTransferConfirmationV08 value) {
        this.prtflTrfConf = value;
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
    public static MxSese01300108 parse(String xml) {
        return ((MxSese01300108) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese01300108 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese01300108 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese01300108) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese01300108 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese01300108 parse(String xml, MxRead parserImpl) {
        return ((MxSese01300108) parserImpl.read(MxSese01300108 .class, xml, _classes));
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
     * Creates an MxSese01300108 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese01300108 message
     * @return
     *     a new instance of MxSese01300108
     */
    public final static MxSese01300108 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese01300108 .class);
    }

}
