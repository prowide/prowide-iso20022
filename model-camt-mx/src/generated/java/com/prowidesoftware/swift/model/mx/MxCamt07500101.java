
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
 * Class for camt.075.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "intraBalMvmntCxlReqStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.075.001.01")
public class MxCamt07500101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "IntraBalMvmntCxlReqStsAdvc", required = true)
    protected IntraBalanceMovementCancellationRequestStatusAdviceV01 intraBalMvmntCxlReqStsAdvc;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 75;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, AcknowledgedAcceptedStatus24Choice.class, AcknowledgementReason12 .class, AcknowledgementReason15Choice.class, AcknowledgementReason3Code.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, Amount2Choice.class, AmountAndDirection5 .class, AmountAndQuantityBreakdown1 .class, BranchAndFinancialInstitutionIdentification6 .class, BranchData3 .class, CancellationReason10 .class, CancellationReason21Choice.class, CancellationStatus15Choice.class, CancelledStatusReason5Code.class, CashAccount38 .class, CashAccountType2Choice.class, CashBalanceType3Choice.class, CashSubBalanceTypeAndQuantityBreakdown3 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CopyDuplicate1Code.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DeniedReason11 .class, DeniedReason16Choice.class, DeniedReason4Code.class, DeniedStatus16Choice.class, DocumentIdentification51 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification18 .class, FinancialInstrumentQuantity1Choice.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification37 .class, Identification14 .class, IntraBalance5 .class, IntraBalanceMovementCancellationRequestStatusAdviceV01 .class, MxCamt07500101 .class, NameAndAddress5 .class, NoReasonCode.class, PartyIdentification120Choice.class, PartyIdentification136 .class, PendingReason17 .class, PendingReason30Choice.class, PendingReason9Code.class, PendingStatus39Choice.class, PostalAddress1 .class, PostalAddress24 .class, PriorityNumeric4Choice.class, ProcessingStatus69Choice.class, ProprietaryReason4 .class, ProprietaryStatusAndReason6 .class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, References14 .class, RejectionAndRepairReason33Choice.class, RejectionOrRepairReason33 .class, RejectionOrRepairStatus39Choice.class, RejectionReason34Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemPartyIdentification8 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.075.001.01";

    public MxCamt07500101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt07500101(final String xml) {
        this();
        MxCamt07500101 tmp = parse(xml);
        intraBalMvmntCxlReqStsAdvc = tmp.getIntraBalMvmntCxlReqStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt07500101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the intraBalMvmntCxlReqStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link IntraBalanceMovementCancellationRequestStatusAdviceV01 }
     *     
     */
    public IntraBalanceMovementCancellationRequestStatusAdviceV01 getIntraBalMvmntCxlReqStsAdvc() {
        return intraBalMvmntCxlReqStsAdvc;
    }

    /**
     * Sets the value of the intraBalMvmntCxlReqStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraBalanceMovementCancellationRequestStatusAdviceV01 }
     *     
     */
    public MxCamt07500101 setIntraBalMvmntCxlReqStsAdvc(IntraBalanceMovementCancellationRequestStatusAdviceV01 value) {
        this.intraBalMvmntCxlReqStsAdvc = value;
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
    public static MxCamt07500101 parse(String xml) {
        return ((MxCamt07500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt07500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt07500101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt07500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt07500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt07500101 parse(String xml, MxRead parserImpl) {
        return ((MxCamt07500101) parserImpl.read(MxCamt07500101 .class, xml, _classes));
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
     * Creates an MxCamt07500101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt07500101 message
     * @return
     *     a new instance of MxCamt07500101
     */
    public final static MxCamt07500101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt07500101 .class);
    }

}
