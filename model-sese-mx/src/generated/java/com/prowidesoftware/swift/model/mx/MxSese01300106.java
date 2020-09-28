
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
 * Class for sese.013.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "prtflTrfConf"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.013.001.06")
public class MxSese01300106
    extends AbstractMX
{

    @XmlElement(name = "PrtflTrfConf", required = true)
    protected PortfolioTransferConfirmationV06 prtflTrfConf;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 13;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account15 .class, Account16 .class, AccountIdentification1 .class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, CashAccount29 .class, CashAccountIdentification1Choice.class, ClearingSystemMemberIdentificationChoice.class, CurrentYearType1Choice.class, Extension1 .class, FinancialInstitutionIdentification3Choice.class, FinancialInstrument40 .class, FinancialInstrumentQuantity1 .class, GenderCode.class, GenericIdentification1 .class, ISAPortfolio2Choice.class, ISATransfer21 .class, ISAType1Code.class, ISAYearsOfIssue5 .class, IndividualPerson8 .class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MxSese01300106 .class, NameAndAddress5 .class, NamePrefix1Code.class, Organisation4 .class, PartyIdentification2Choice.class, PartyIdentification4Choice.class, PartyIdentificationAndAccount93 .class, Portfolio1 .class, PortfolioTransferConfirmationV06 .class, PostalAddress1 .class, PreviousYear1Choice.class, PreviousYear3 .class, Quantity14Choice.class, ResidualCash1Code.class, SecurityIdentification3Choice.class, SimpleIdentificationInformation.class, SubAccount1 .class, SubscriptionInformation1 .class, TransferType1Code.class, UKTaxGroupUnitCode.class, Unit4 .class, Unit5 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:sese.013.001.06";

    public MxSese01300106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese01300106(final String xml) {
        this();
        MxSese01300106 tmp = parse(xml);
        prtflTrfConf = tmp.getPrtflTrfConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese01300106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the prtflTrfConf property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioTransferConfirmationV06 }
     *     
     */
    public PortfolioTransferConfirmationV06 getPrtflTrfConf() {
        return prtflTrfConf;
    }

    /**
     * Sets the value of the prtflTrfConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioTransferConfirmationV06 }
     *     
     */
    public MxSese01300106 setPrtflTrfConf(PortfolioTransferConfirmationV06 value) {
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
    public static MxSese01300106 parse(String xml) {
        return ((MxSese01300106) MxReadImpl.parse(MxSese01300106 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese01300106 parse(String xml, MxRead parserImpl) {
        return ((MxSese01300106) parserImpl.read(MxSese01300106 .class, xml, _classes));
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
     * Creates an MxSese01300106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese01300106 message
     * @return
     *     a new instance of MxSese01300106
     */
    public final static MxSese01300106 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSese01300106 .class);
    }

}
