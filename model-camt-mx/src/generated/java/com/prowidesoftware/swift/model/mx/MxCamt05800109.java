
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
 * Class for camt.058.001.09 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ntfctnToRcvCxlAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.058.001.09")
public class MxCamt05800109
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "NtfctnToRcvCxlAdvc", required = true)
    protected NotificationToReceiveCancellationAdviceV09 ntfctnToRcvCxlAdvc;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 58;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 9;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, BranchAndFinancialInstitutionIdentification8 .class, BranchData5 .class, CashAccount40 .class, CashAccountType2Choice.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, Contact13 .class, CreditDebitCode.class, CreditorReferenceInformation3 .class, CreditorReferenceType2Choice.class, CreditorReferenceType3 .class, DateAndPlaceOfBirth1 .class, DateAndType1 .class, DatePeriod2 .class, DateType2Choice.class, DocumentAdjustment1 .class, DocumentAmount1 .class, DocumentAmountType1Choice.class, DocumentLineIdentification1 .class, DocumentLineInformation2 .class, DocumentLineType1 .class, DocumentLineType1Choice.class, DocumentType1 .class, DocumentType2Choice.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification23 .class, Garnishment4 .class, GarnishmentType1 .class, GarnishmentType1Choice.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GenericOrganisationIdentification3 .class, GenericPersonIdentification2 .class, GroupHeader117 .class, MxCamt05800109 .class, NameAndAddress18 .class, NamePrefix2Code.class, NotificationCancellationReason1Choice.class, NotificationCancellationReason2 .class, NotificationToReceiveCancellationAdviceV09 .class, OrganisationIdentification39 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalItem8 .class, OriginalItemReference7 .class, OriginalNotification16 .class, OriginalNotificationReference14 .class, OtherContact1 .class, Party50Choice.class, Party52Choice.class, PartyIdentification272 .class, PersonIdentification18 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress27 .class, PreferredContactMethod2Code.class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, Purpose2Choice.class, ReferredDocumentInformation8 .class, RemittanceAmount4 .class, RemittanceInformation22 .class, RemittanceLocation8 .class, RemittanceLocationData2 .class, RemittanceLocationMethod2Code.class, StructuredRemittanceInformation18 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxAmount3 .class, TaxAuthorisation1 .class, TaxData1 .class, TaxParty1 .class, TaxParty2 .class, TaxPeriod3 .class, TaxRecord3 .class, TaxRecordDetails3 .class, TaxRecordPeriod1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.058.001.09";

    public MxCamt05800109() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt05800109(final String xml) {
        this();
        MxCamt05800109 tmp = parse(xml);
        ntfctnToRcvCxlAdvc = tmp.getNtfctnToRcvCxlAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt05800109(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ntfctnToRcvCxlAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationToReceiveCancellationAdviceV09 }
     *     
     */
    public NotificationToReceiveCancellationAdviceV09 getNtfctnToRcvCxlAdvc() {
        return ntfctnToRcvCxlAdvc;
    }

    /**
     * Sets the value of the ntfctnToRcvCxlAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationToReceiveCancellationAdviceV09 }
     *     
     */
    public MxCamt05800109 setNtfctnToRcvCxlAdvc(NotificationToReceiveCancellationAdviceV09 value) {
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
    public static MxCamt05800109 parse(String xml) {
        return ((MxCamt05800109) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt05800109 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt05800109 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt05800109) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt05800109 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt05800109 parse(String xml, MxRead parserImpl) {
        return ((MxCamt05800109) parserImpl.read(MxCamt05800109 .class, xml, _classes));
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
     * Creates an MxCamt05800109 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt05800109 message
     * @return
     *     a new instance of MxCamt05800109
     */
    public static final MxCamt05800109 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt05800109 .class);
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
