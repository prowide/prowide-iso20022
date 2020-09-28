
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
 * Class for sese.018.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctHldgInf"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.018.001.04")
public class MxSese01800104
    extends AbstractMX
{

    @XmlElement(name = "AcctHldgInf", required = true)
    protected AccountHoldingInformationV04 acctHldgInf;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 18;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account15 .class, Account16 .class, AccountHoldingInformationV04 .class, AccountIdentification1 .class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, BusinessFlowDirectionType1Code.class, CurrentYearType1Choice.class, Extension1 .class, FinancialInstrument37 .class, GenderCode.class, GenericIdentification1 .class, ISAPortfolio1Choice.class, ISATransfer14 .class, ISAType1Code.class, ISAYearsOfIssue4 .class, IndividualPerson8 .class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MxSese01800104 .class, NameAndAddress5 .class, NamePrefix1Code.class, Organisation4 .class, PartyIdentification2Choice.class, PartyIdentification4Choice.class, PartyIdentificationAndAccount93 .class, Portfolio1 .class, PostalAddress1 .class, PreviousYear1Choice.class, PreviousYear2 .class, Quantity12Choice.class, ResidualCash1Code.class, SecurityIdentification3Choice.class, SimpleIdentificationInformation.class, SubAccount1 .class, SubscriptionInformation1 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:sese.018.001.04";

    public MxSese01800104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese01800104(final String xml) {
        this();
        MxSese01800104 tmp = parse(xml);
        acctHldgInf = tmp.getAcctHldgInf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese01800104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctHldgInf property.
     * 
     * @return
     *     possible object is
     *     {@link AccountHoldingInformationV04 }
     *     
     */
    public AccountHoldingInformationV04 getAcctHldgInf() {
        return acctHldgInf;
    }

    /**
     * Sets the value of the acctHldgInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountHoldingInformationV04 }
     *     
     */
    public MxSese01800104 setAcctHldgInf(AccountHoldingInformationV04 value) {
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
    public static MxSese01800104 parse(String xml) {
        return ((MxSese01800104) MxReadImpl.parse(MxSese01800104 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese01800104 parse(String xml, MxRead parserImpl) {
        return ((MxSese01800104) parserImpl.read(MxSese01800104 .class, xml, _classes));
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
     * Creates an MxSese01800104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese01800104 message
     * @return
     *     a new instance of MxSese01800104
     */
    public final static MxSese01800104 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSese01800104 .class);
    }

}
