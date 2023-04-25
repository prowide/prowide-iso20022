
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
 * Class for cbrf.004.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "lqdtyRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:cbrf:xsd:cbrf.004.001.01")
public class MxCbrf00400101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "LqdtyRpt", required = true)
    protected LiquidityReportV01 lqdtyRpt;
    public static final transient String BUSINESS_PROCESS = "cbrf";
    public static final transient int FUNCTIONALITY = 4;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountLimits1 .class, AccountLiquidityReport1 .class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, ArrestedFunds1 .class, BalanceStatus1Code.class, BalanceType9Choice.class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CashAccount25 .class, CashAccountType2Choice.class, CashBalance6 .class, ClearingScheme1Choice.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateAndPlaceOfBirth.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, LiquidityDetails1 .class, LiquidityReportV01 .class, MessageHeader3 .class, MxCbrf00400101 .class, NamePrefix1Code.class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalBusinessQuery1 .class, Party11Choice.class, PartyIdentification43 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, QueueTransaction1 .class, QueuedTransactionsReport1 .class, RequestType1Code.class, RequestType2Choice.class, RequestType2Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemBalanceType2Code.class };
    public static final transient String NAMESPACE = "urn:cbrf:xsd:cbrf.004.001.01";

    public MxCbrf00400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCbrf00400101(final String xml) {
        this();
        MxCbrf00400101 tmp = parse(xml);
        lqdtyRpt = tmp.getLqdtyRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCbrf00400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the lqdtyRpt property.
     * 
     * @return
     *     possible object is
     *     {@link LiquidityReportV01 }
     *     
     */
    public LiquidityReportV01 getLqdtyRpt() {
        return lqdtyRpt;
    }

    /**
     * Sets the value of the lqdtyRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiquidityReportV01 }
     *     
     */
    public MxCbrf00400101 setLqdtyRpt(LiquidityReportV01 value) {
        this.lqdtyRpt = value;
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
    public static MxCbrf00400101 parse(String xml) {
        return ((MxCbrf00400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCbrf00400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCbrf00400101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCbrf00400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCbrf00400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCbrf00400101 parse(String xml, MxRead parserImpl) {
        return ((MxCbrf00400101) parserImpl.read(MxCbrf00400101 .class, xml, _classes));
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
     * Creates an MxCbrf00400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCbrf00400101 message
     * @return
     *     a new instance of MxCbrf00400101
     */
    public static final MxCbrf00400101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCbrf00400101 .class);
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
