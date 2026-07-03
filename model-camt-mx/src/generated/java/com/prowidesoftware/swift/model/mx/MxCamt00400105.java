
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
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for camt.004.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rtrAcct"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.004.001.05")
public class MxCamt00400105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RtrAcct", required = true)
    protected ReturnAccountV05 rtrAcct;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 4;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountOrBusinessError1Choice.class, AccountOrOperationalError1Choice.class, AccountReport13 .class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, Amount2Choice.class, BalanceRestrictionType1 .class, BalanceStatus1Code.class, BalanceType8Choice.class, BalanceType9Choice.class, BilateralLimit1 .class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CashAccount23 .class, CashAccount24 .class, CashAccountType2Choice.class, CashBalance5 .class, CashBalance6 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateAndPlaceOfBirth.class, DatePeriodDetails1 .class, ErrorHandling1Choice.class, ErrorHandling1Code.class, ErrorHandling3 .class, EventType1Choice.class, ExecutionType1Choice.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, Frequency2Code.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, Limit5 .class, MessageHeader3 .class, MxCamt00400105 .class, NamePrefix1Code.class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalBusinessQuery1 .class, Party11Choice.class, PartyIdentification43 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, ProcessingType1Choice.class, ProcessingType1Code.class, RequestType1Code.class, RequestType2Choice.class, RequestType2Code.class, ReturnAccountV05 .class, StandingOrder2 .class, StandingOrderTotalAmount1 .class, StandingOrderType1Choice.class, StandingOrderType1Code.class, SystemBalanceType1Code.class, SystemBalanceType2Code.class, TotalAmountAndCurrency1 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.004.001.05";

    public MxCamt00400105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt00400105(final String xml) {
        this();
        MxCamt00400105 tmp = parse(xml);
        rtrAcct = tmp.getRtrAcct();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt00400105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnAccountV05 }
     *     
     */
    public ReturnAccountV05 getRtrAcct() {
        return rtrAcct;
    }

    /**
     * Sets the value of the rtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnAccountV05 }
     *     
     */
    public MxCamt00400105 setRtrAcct(ReturnAccountV05 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxCamt00400105 parse(String xml) {
        return ((MxCamt00400105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00400105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt00400105 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt00400105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00400105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt00400105 parse(String xml, MxRead parserImpl) {
        return ((MxCamt00400105) parserImpl.read(MxCamt00400105 .class, xml, _classes));
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
     * Creates an MxCamt00400105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt00400105 message
     * @return
     *     a new instance of MxCamt00400105
     */
    public final static MxCamt00400105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt00400105 .class);
    }

}
