
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
 * Class for camt.058.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ntfctnToRcvCxlAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.058.001.04")
public class MxCamt05800104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "NtfctnToRcvCxlAdvc", required = true)
    protected NotificationToReceiveCancellationAdviceV04 ntfctnToRcvCxlAdvc;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 58;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CashAccount24 .class, CashAccountType2Choice.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, CreditDebitCode.class, CreditorReferenceInformation2 .class, CreditorReferenceType1Choice.class, CreditorReferenceType2 .class, DateAndPlaceOfBirth.class, DatePeriodDetails.class, DiscountAmountAndType1 .class, DiscountAmountType1Choice.class, DocumentAdjustment1 .class, DocumentType3Code.class, DocumentType6Code.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, Garnishment1 .class, GarnishmentType1 .class, GarnishmentType1Choice.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GroupHeader59 .class, MxCamt05800104 .class, NameAndAddress10 .class, NamePrefix1Code.class, NotificationToReceiveCancellationAdviceV04 .class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalItem4 .class, OriginalItemReference3 .class, OriginalNotification8 .class, OriginalNotificationReference6 .class, Party11Choice.class, Party12Choice.class, PartyIdentification43 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, Purpose2Choice.class, ReferredDocumentInformation6 .class, ReferredDocumentType3Choice.class, ReferredDocumentType4 .class, RemittanceAmount2 .class, RemittanceInformation10 .class, RemittanceLocation4 .class, RemittanceLocationDetails1 .class, RemittanceLocationMethod2Code.class, StructuredRemittanceInformation12 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxAmount1 .class, TaxAmountAndType1 .class, TaxAmountType1Choice.class, TaxAuthorisation1 .class, TaxInformation4 .class, TaxParty1 .class, TaxParty2 .class, TaxPeriod1 .class, TaxRecord1 .class, TaxRecordDetails1 .class, TaxRecordPeriod1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.058.001.04";

    public MxCamt05800104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt05800104(final String xml) {
        this();
        MxCamt05800104 tmp = parse(xml);
        ntfctnToRcvCxlAdvc = tmp.getNtfctnToRcvCxlAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt05800104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ntfctnToRcvCxlAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationToReceiveCancellationAdviceV04 }
     *     
     */
    public NotificationToReceiveCancellationAdviceV04 getNtfctnToRcvCxlAdvc() {
        return ntfctnToRcvCxlAdvc;
    }

    /**
     * Sets the value of the ntfctnToRcvCxlAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationToReceiveCancellationAdviceV04 }
     *     
     */
    public MxCamt05800104 setNtfctnToRcvCxlAdvc(NotificationToReceiveCancellationAdviceV04 value) {
        this.ntfctnToRcvCxlAdvc = value;
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
    public static MxCamt05800104 parse(String xml) {
        return ((MxCamt05800104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt05800104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt05800104 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt05800104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt05800104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt05800104 parse(String xml, MxRead parserImpl) {
        return ((MxCamt05800104) parserImpl.read(MxCamt05800104 .class, xml, _classes));
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
     * Creates an MxCamt05800104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt05800104 message
     * @return
     *     a new instance of MxCamt05800104
     */
    public static final MxCamt05800104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt05800104 .class);
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
