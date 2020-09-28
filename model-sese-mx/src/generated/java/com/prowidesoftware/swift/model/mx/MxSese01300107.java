
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for sese.013.001.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "prtflTrfConf"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.013.001.07")
public class MxSese01300107
    extends AbstractMX
{

    @XmlElement(name = "PrtflTrfConf", required = true)
    protected PortfolioTransferConfirmationV07 prtflTrfConf;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 13;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account19 .class, Account20 .class, AccountIdentification4Choice.class, AccountIdentificationAndName5 .class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference6 .class, AdditionalReference7 .class, AddressType2Code.class, AllOtherCash1Code.class, AlternateSecurityIdentification7 .class, BusinessFlowType1Code.class, CashAccount34 .class, ClearingSystemMemberIdentificationChoice.class, ContactIdentification2 .class, CurrentYearType1Choice.class, DateAndDateTimeChoice.class, Extension1 .class, FinancialInstitutionIdentification7Choice.class, FinancialInstrument48 .class, FinancialInstrumentQuantity1 .class, GenderCode.class, GenericAccountIdentification1 .class, GenericIdentification1 .class, GenericIdentification47 .class, ISAPortfolio2Choice.class, ISATransfer26 .class, ISAType1Code.class, ISAYearsOfIssue5 .class, IdentificationSource1Choice.class, IndividualPerson8 .class, Intermediary34 .class, InvestmentFundRole2Code.class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MxSese01300107 .class, NameAndAddress5 .class, NamePrefix1Code.class, Organisation21 .class, PartyIdentification70Choice.class, PartyIdentification72Choice.class, PartyIdentification90Choice.class, PartyIdentification97 .class, PartyIdentification97Choice.class, PartyIdentificationAndAccount123 .class, PartyIdentificationAndAccount124 .class, PartyIdentificationAndAccount125 .class, Portfolio1 .class, PortfolioTransferConfirmationV07 .class, PostalAddress1 .class, PreviousYear1Choice.class, PreviousYear3 .class, Quantity14Choice.class, ReceivingPartiesAndAccount14 .class, ResidualCash1Code.class, Role4Choice.class, SecurityIdentification23Choice.class, SimpleIdentificationInformation4 .class, SubAccount5 .class, SubscriptionInformation1 .class, TransferType1Code.class, UKTaxGroupUnitCode.class, Unit4 .class, Unit5 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:sese.013.001.07";

    public MxSese01300107() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese01300107(final String xml) {
        this();
        MxSese01300107 tmp = parse(xml);
        prtflTrfConf = tmp.getPrtflTrfConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese01300107(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the prtflTrfConf property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioTransferConfirmationV07 }
     *     
     */
    public PortfolioTransferConfirmationV07 getPrtflTrfConf() {
        return prtflTrfConf;
    }

    /**
     * Sets the value of the prtflTrfConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioTransferConfirmationV07 }
     *     
     */
    public MxSese01300107 setPrtflTrfConf(PortfolioTransferConfirmationV07 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxSese01300107 parse(String xml) {
        return ((MxSese01300107) MxReadImpl.parse(MxSese01300107 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese01300107 parse(String xml, MxRead parserImpl) {
        return ((MxSese01300107) parserImpl.read(MxSese01300107 .class, xml, _classes));
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
     * Creates an MxSese01300107 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese01300107 message
     * @return
     *     a new instance of MxSese01300107
     */
    public final static MxSese01300107 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSese01300107 .class);
    }

}
