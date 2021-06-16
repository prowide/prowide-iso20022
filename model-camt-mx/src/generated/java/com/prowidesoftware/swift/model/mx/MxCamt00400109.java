
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
 * Class for camt.004.001.09 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rtrAcct"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.004.001.09")
public class MxCamt00400109
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RtrAcct", required = true)
    protected ReturnAccountV09 rtrAcct;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 4;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 9;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountOrBusinessError5Choice.class, AccountOrOperationalError5Choice.class, AccountReport29 .class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, Amount2Choice.class, BalanceRestrictionType1 .class, BalanceStatus1Code.class, BalanceType11Choice.class, BalanceType9Choice.class, BilateralLimit3 .class, BranchAndFinancialInstitutionIdentification6 .class, BranchData3 .class, CashAccount40 .class, CashAccount42 .class, CashAccountType2Choice.class, CashBalance11 .class, CashBalance13 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, Contact4 .class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateAndPlaceOfBirth1 .class, DatePeriod3 .class, ErrorHandling3Choice.class, ErrorHandling5 .class, EventType1Choice.class, ExecutionType1Choice.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification18 .class, Frequency2Code.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GenericIdentification30 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, Limit5 .class, MessageHeader7 .class, MxCamt00400109 .class, NamePrefix2Code.class, OrganisationIdentification29 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalBusinessQuery1 .class, OtherContact1 .class, Party38Choice.class, PartyIdentification135 .class, PersonIdentification13 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress24 .class, PreferredContactMethod1Code.class, ProcessingType1Choice.class, ProcessingType1Code.class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, RequestType4Choice.class, ReturnAccountV09 .class, StandingOrder9 .class, StandingOrderTotalAmount1 .class, StandingOrderType1Choice.class, StandingOrderType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemBalanceType2Code.class, TotalAmountAndCurrency1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.004.001.09";

    public MxCamt00400109() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt00400109(final String xml) {
        this();
        MxCamt00400109 tmp = parse(xml);
        rtrAcct = tmp.getRtrAcct();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt00400109(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnAccountV09 }
     *     
     */
    public ReturnAccountV09 getRtrAcct() {
        return rtrAcct;
    }

    /**
     * Sets the value of the rtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnAccountV09 }
     *     
     */
    public MxCamt00400109 setRtrAcct(ReturnAccountV09 value) {
        this.rtrAcct = value;
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
    public static MxCamt00400109 parse(String xml) {
        return ((MxCamt00400109) MxReadImpl.parse(MxCamt00400109 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt00400109 parse(String xml, MxRead parserImpl) {
        return ((MxCamt00400109) parserImpl.read(MxCamt00400109 .class, xml, _classes));
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
     * Creates an MxCamt00400109 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt00400109 message
     * @return
     *     a new instance of MxCamt00400109
     */
    public final static MxCamt00400109 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt00400109 .class);
    }

}
