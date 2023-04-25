
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
 * Class for pacs.002.003.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "pacs00200302"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:pacs.002.003.02")
public class MxPacs00200302
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "pacs.002.003.02", required = true)
    protected Pacs00200302 pacs00200302;
    public static final transient String BUSINESS_PROCESS = "pacs";
    public static final transient int FUNCTIONALITY = 2;
    public static final transient int VARIANT = 3;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification2 .class, AccountIdentification3Choice.class, AddressType2Code.class, AmendmentInformationDetails5 .class, AmountType2Choice.class, CashAccount7 .class, CashAccount8 .class, CashAccountType2 .class, CashAccountType4Code.class, CashClearingSystem3Code.class, ChargesInformation2 .class, ClearingChannel2Code.class, ClearingSystemIdentification1Choice.class, CreditorReferenceInformation1 .class, CreditorReferenceType1 .class, CurrencyAndAmount.class, DateAndPlaceOfBirth.class, DocumentType2Code.class, DocumentType3Code.class, EquivalentAmount.class, EuroMax9Amount.class, FinancialInstitution2 .class, FinancialInstitution3 .class, FinancialInstitutionIdentification4 .class, FinancialInstitutionIdentification5 .class, Frequency1Code.class, GenericIdentification3 .class, GenericIdentification4 .class, GroupHeader12 .class, LocalInstrument1Choice.class, MandateRelatedInformation5 .class, MxPacs00200302 .class, NumberOfTransactionsPerStatus2 .class, OrganisationIdentification2 .class, OrganisationIdentification3 .class, OriginalGroupInformation15 .class, OriginalTransactionReference9 .class, Pacs00200302 .class, Party2Choice.class, Party5Choice.class, PartyIdentification14 .class, PartyIdentification18 .class, PartyIdentification20 .class, PartyIdentification8 .class, PartyOrganisation1Choice.class, PartyPrivate1 .class, PaymentCategoryPurpose1Code.class, PaymentMethod4Code.class, PaymentTransactionInformation15 .class, PaymentTypeInformation12 .class, PersonIdentification3 .class, PersonIdentification4 .class, PostalAddress1 .class, PostalAddress4 .class, Priority2Code.class, ReferredDocumentAmount1Choice.class, ReferredDocumentInformation1 .class, ReferredDocumentType1 .class, RemittanceInformation4 .class, RestrictedIdentification1 .class, RestrictedIdentification2 .class, SequenceType1Code.class, ServiceLevel3Code.class, ServiceLevel6Choice.class, SettlementInformation6 .class, SettlementMethod1Code.class, SimpleIdentificationInformation2 .class, StatusReason1Choice.class, StatusReasonInformation5 .class, StructuredRemittanceInformation6 .class, TransactionGroupStatus2Code.class, TransactionIndividualStatus2Code.class, TransactionRejectReason2Code.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:pacs.002.003.02";

    public MxPacs00200302() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxPacs00200302(final String xml) {
        this();
        MxPacs00200302 tmp = parse(xml);
        pacs00200302 = tmp.getPacs00200302();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxPacs00200302(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the pacs00200302 property.
     * 
     * @return
     *     possible object is
     *     {@link Pacs00200302 }
     *     
     */
    public Pacs00200302 getPacs00200302() {
        return pacs00200302;
    }

    /**
     * Sets the value of the pacs00200302 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pacs00200302 }
     *     
     */
    public MxPacs00200302 setPacs00200302(Pacs00200302 value) {
        this.pacs00200302 = value;
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
    public static MxPacs00200302 parse(String xml) {
        return ((MxPacs00200302) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPacs00200302 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxPacs00200302 parse(String xml, MxReadConfiguration conf) {
        return ((MxPacs00200302) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPacs00200302 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxPacs00200302 parse(String xml, MxRead parserImpl) {
        return ((MxPacs00200302) parserImpl.read(MxPacs00200302 .class, xml, _classes));
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
     * Creates an MxPacs00200302 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxPacs00200302 message
     * @return
     *     a new instance of MxPacs00200302
     */
    public static final MxPacs00200302 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxPacs00200302 .class);
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
