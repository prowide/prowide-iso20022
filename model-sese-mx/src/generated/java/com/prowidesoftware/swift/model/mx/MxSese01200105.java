
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
 * Class for sese.012.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "prtflTrfInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.012.001.05")
public class MxSese01200105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "PrtflTrfInstr", required = true)
    protected PortfolioTransferInstructionV05 prtflTrfInstr;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 12;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account15 .class, Account16 .class, AccountIdentification1 .class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, CashAccount29 .class, CashAccountIdentification1Choice.class, ClearingSystemMemberIdentificationChoice.class, CurrentYearType1Choice.class, DateFormat1Choice.class, Extension1 .class, FinancialInstitutionIdentification3Choice.class, FinancialInstrument34 .class, GenderCode.class, GenericIdentification1 .class, ISAPortfolio1Choice.class, ISATransfer16 .class, ISAType1Code.class, ISAYearsOfIssue4 .class, IndividualPerson8 .class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MxSese01200105 .class, NameAndAddress5 .class, NamePrefix1Code.class, Organisation4 .class, PartyIdentification2Choice.class, PartyIdentification4Choice.class, PartyIdentificationAndAccount93 .class, Portfolio1 .class, PortfolioTransferInstructionV05 .class, PostalAddress1 .class, PreviousYear1Choice.class, PreviousYear2 .class, Quantity12Choice.class, ResidualCash1Code.class, SecurityIdentification3Choice.class, SettlementDate1Code.class, SimpleIdentificationInformation.class, SubAccount1 .class, SubscriptionInformation1 .class, TransferType1Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:sese.012.001.05";

    public MxSese01200105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese01200105(final String xml) {
        this();
        MxSese01200105 tmp = parse(xml);
        prtflTrfInstr = tmp.getPrtflTrfInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese01200105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the prtflTrfInstr property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioTransferInstructionV05 }
     *     
     */
    public PortfolioTransferInstructionV05 getPrtflTrfInstr() {
        return prtflTrfInstr;
    }

    /**
     * Sets the value of the prtflTrfInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioTransferInstructionV05 }
     *     
     */
    public MxSese01200105 setPrtflTrfInstr(PortfolioTransferInstructionV05 value) {
        this.prtflTrfInstr = value;
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
    public static MxSese01200105 parse(String xml) {
        return ((MxSese01200105) MxReadImpl.parse(MxSese01200105 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese01200105 parse(String xml, MxRead parserImpl) {
        return ((MxSese01200105) parserImpl.read(MxSese01200105 .class, xml, _classes));
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
     * Creates an MxSese01200105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese01200105 message
     * @return
     *     a new instance of MxSese01200105
     */
    public final static MxSese01200105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese01200105 .class);
    }

}
