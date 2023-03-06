
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
 * Class for camt.067.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "intraBalMvmntStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.067.001.01")
public class MxCamt06700101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "IntraBalMvmntStsAdvc", required = true)
    protected IntraBalanceMovementStatusAdviceV01 intraBalMvmntStsAdvc;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 67;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, AcknowledgedAcceptedStatus21Choice.class, AcknowledgementReason12Choice.class, AcknowledgementReason5Code.class, AcknowledgementReason9 .class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, Amount2Choice.class, AmountAndDirection5 .class, AmountAndQuantityBreakdown1 .class, BranchAndFinancialInstitutionIdentification6 .class, BranchData3 .class, CancellationReason19Choice.class, CancellationReason9 .class, CancellationStatus14Choice.class, CancelledStatusReason13Code.class, CashAccount38 .class, CashAccountType2Choice.class, CashBalanceType3Choice.class, CashSubBalanceTypeAndQuantityBreakdown3 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CopyDuplicate1Code.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DocumentIdentification51 .class, FailingReason3Code.class, FailingReason7 .class, FailingReason7Choice.class, FailingStatus9Choice.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification18 .class, FinancialInstrumentQuantity1Choice.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification37 .class, IntraBalance5 .class, IntraBalanceMovementStatusAdviceV01 .class, MxCamt06700101 .class, NameAndAddress5 .class, NoReasonCode.class, PartyIdentification120Choice.class, PartyIdentification136 .class, PendingReason10Code.class, PendingReason14 .class, PendingReason26Choice.class, PendingStatus36Choice.class, PostalAddress1 .class, PostalAddress24 .class, PriorityNumeric4Choice.class, ProcessingStatus67Choice.class, ProprietaryReason4 .class, ProprietaryStatusAndReason6 .class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, RejectionAndRepairReason32Choice.class, RejectionOrRepairReason32 .class, RejectionOrRepairStatus38Choice.class, RejectionReason33Code.class, SettlementStatus16Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemPartyIdentification8 .class, TransactionIdentifications24 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.067.001.01";

    public MxCamt06700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt06700101(final String xml) {
        this();
        MxCamt06700101 tmp = parse(xml);
        intraBalMvmntStsAdvc = tmp.getIntraBalMvmntStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt06700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the intraBalMvmntStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link IntraBalanceMovementStatusAdviceV01 }
     *     
     */
    public IntraBalanceMovementStatusAdviceV01 getIntraBalMvmntStsAdvc() {
        return intraBalMvmntStsAdvc;
    }

    /**
     * Sets the value of the intraBalMvmntStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraBalanceMovementStatusAdviceV01 }
     *     
     */
    public MxCamt06700101 setIntraBalMvmntStsAdvc(IntraBalanceMovementStatusAdviceV01 value) {
        this.intraBalMvmntStsAdvc = value;
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
    public static MxCamt06700101 parse(String xml) {
        return ((MxCamt06700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt06700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt06700101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt06700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt06700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt06700101 parse(String xml, MxRead parserImpl) {
        return ((MxCamt06700101) parserImpl.read(MxCamt06700101 .class, xml, _classes));
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
     * Creates an MxCamt06700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt06700101 message
     * @return
     *     a new instance of MxCamt06700101
     */
    public final static MxCamt06700101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt06700101 .class);
    }

}
