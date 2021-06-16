
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
 * Class for sese.018.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctHldgInf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.018.001.06")
public class MxSese01800106
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcctHldgInf", required = true)
    protected AccountHoldingInformationV06 acctHldgInf;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 18;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account24 .class, AccountHoldingInformationV06 .class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference8 .class, AdditionalReference9 .class, AddressType2Code.class, AllOtherCash1Code.class, AlternateSecurityIdentification7 .class, BusinessFlowDirectionType1Code.class, CurrentYearType1Choice.class, Extension1 .class, FinancialInstrument61 .class, GenderCode.class, GenericIdentification1 .class, ISAPortfolio1Choice.class, ISATransfer30 .class, ISAType1Code.class, ISAYearsOfIssue4 .class, IdentificationSource1Choice.class, IndividualPerson8 .class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MxSese01800106 .class, NameAndAddress5 .class, NamePrefix1Code.class, Organisation31 .class, PartyIdentification113 .class, PartyIdentification119Choice.class, PartyIdentification124 .class, PartyIdentification90Choice.class, PartyIdentificationAndAccount156 .class, Portfolio1 .class, PostalAddress1 .class, PreviousYear1Choice.class, PreviousYear2 .class, Quantity12Choice.class, ResidualCash1Code.class, SecurityIdentification25Choice.class, SubAccount5 .class, SubscriptionInformation1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.018.001.06";

    public MxSese01800106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese01800106(final String xml) {
        this();
        MxSese01800106 tmp = parse(xml);
        acctHldgInf = tmp.getAcctHldgInf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese01800106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctHldgInf property.
     * 
     * @return
     *     possible object is
     *     {@link AccountHoldingInformationV06 }
     *     
     */
    public AccountHoldingInformationV06 getAcctHldgInf() {
        return acctHldgInf;
    }

    /**
     * Sets the value of the acctHldgInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountHoldingInformationV06 }
     *     
     */
    public MxSese01800106 setAcctHldgInf(AccountHoldingInformationV06 value) {
        this.acctHldgInf = value;
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
    public static MxSese01800106 parse(String xml) {
        return ((MxSese01800106) MxReadImpl.parse(MxSese01800106 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese01800106 parse(String xml, MxRead parserImpl) {
        return ((MxSese01800106) parserImpl.read(MxSese01800106 .class, xml, _classes));
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
     * Creates an MxSese01800106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese01800106 message
     * @return
     *     a new instance of MxSese01800106
     */
    public final static MxSese01800106 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese01800106 .class);
    }

}
