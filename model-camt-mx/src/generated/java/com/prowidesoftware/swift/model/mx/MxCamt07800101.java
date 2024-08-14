
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
 * Class for camt.078.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "intraBalMvmntQry"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.078.001.01")
public class MxCamt07800101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "IntraBalMvmntQry", required = true)
    protected IntraBalanceMovementQueryV01 intraBalMvmntQry;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 78;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountIdentificationSearchCriteria2Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, AmountAndDirection5 .class, AmountAndQuantityBreakdown1 .class, AmountRangeBoundary1 .class, BranchAndFinancialInstitutionIdentification6 .class, BranchData3 .class, CashBalanceType3Choice.class, CashSubBalanceTypeAndQuantityBreakdown3 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CopyDuplicate1Code.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateAndDateTimeSearch5Choice.class, DatePeriod2 .class, DatePeriodSearch1Choice.class, DateTimePeriod1 .class, DateTimeSearch2Choice.class, DocumentIdentification51 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification18 .class, FinancialInstrumentQuantity1Choice.class, FromToAmountRange1 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification37 .class, ImpliedCurrencyAmountRange1Choice.class, IntraBalanceMovementQueryV01 .class, IntraBalanceQueryCriteria9 .class, IntraBalanceQueryDefinition9 .class, IntraBalanceQueryStatus3 .class, IntraBalanceStatusType2 .class, IntraBalanceType3 .class, MovementResponseType1Code.class, MxCamt07800101 .class, NameAndAddress5 .class, PartyIdentification120Choice.class, PartyIdentification136 .class, PostalAddress1 .class, PostalAddress24 .class, PriorityNumeric4Choice.class, ProcessingStatus68Choice.class, ProprietaryReason4 .class, References36Choice.class, SecuritiesSettlementStatus1Code.class, SettlementStatus26Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemPartyIdentification8 .class, TransactionProcessingStatus3Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.078.001.01";

    public MxCamt07800101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt07800101(final String xml) {
        this();
        MxCamt07800101 tmp = parse(xml);
        intraBalMvmntQry = tmp.getIntraBalMvmntQry();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt07800101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the intraBalMvmntQry property.
     * 
     * @return
     *     possible object is
     *     {@link IntraBalanceMovementQueryV01 }
     *     
     */
    public IntraBalanceMovementQueryV01 getIntraBalMvmntQry() {
        return intraBalMvmntQry;
    }

    /**
     * Sets the value of the intraBalMvmntQry property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraBalanceMovementQueryV01 }
     *     
     */
    public MxCamt07800101 setIntraBalMvmntQry(IntraBalanceMovementQueryV01 value) {
        this.intraBalMvmntQry = value;
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
    public static MxCamt07800101 parse(String xml) {
        return ((MxCamt07800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt07800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt07800101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt07800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt07800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt07800101 parse(String xml, MxRead parserImpl) {
        return ((MxCamt07800101) parserImpl.read(MxCamt07800101 .class, xml, _classes));
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
     * Creates an MxCamt07800101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt07800101 message
     * @return
     *     a new instance of MxCamt07800101
     */
    public static final MxCamt07800101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt07800101 .class);
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
