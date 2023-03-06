
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
 * Class for pacs.002.000.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "pacs00200001"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:pacs.002.000.01")
public class MxPacs00200001
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "pacs.002.000.01", required = true)
    protected Pacs00200001 pacs00200001;
    public final static transient String BUSINESS_PROCESS = "pacs";
    public final static transient int FUNCTIONALITY = 2;
    public final static transient int VARIANT = 0;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification3Choice.class, AddressType2Code.class, AmendmentInformationDetails1 .class, AmountType2Choice.class, BranchAndFinancialInstitutionIdentification3 .class, BranchData.class, CashAccount7 .class, CashAccountType2 .class, CashAccountType4Code.class, CashClearingSystem3Code.class, ChargesInformation1 .class, ClearingChannel2Code.class, ClearingSystemIdentification1Choice.class, ClearingSystemMemberIdentification3Choice.class, CreditorReferenceInformation1 .class, CreditorReferenceType1 .class, CurrencyAndAmount.class, DateAndPlaceOfBirth.class, DocumentType2Code.class, DocumentType3Code.class, EquivalentAmount.class, FinancialInstitutionIdentification3 .class, FinancialInstitutionIdentification5Choice.class, Frequency1Code.class, GenericIdentification3 .class, GenericIdentification4 .class, GroupHeader5 .class, LocalInstrument1Choice.class, MandateRelatedInformation1 .class, MxPacs00200001 .class, NameAndAddress7 .class, NumberOfTransactionsPerStatus1 .class, OrganisationIdentification2 .class, OriginalGroupInformation1 .class, OriginalTransactionReference1 .class, Pacs00200001 .class, Party2Choice.class, PartyIdentification8 .class, PaymentCategoryPurpose1Code.class, PaymentMethod4Code.class, PaymentTransactionInformation1 .class, PaymentTypeInformation6 .class, PersonIdentification3 .class, PostalAddress1 .class, Priority2Code.class, ReferredDocumentAmount1Choice.class, ReferredDocumentInformation1 .class, ReferredDocumentType1 .class, RemittanceInformation1 .class, SequenceType1Code.class, ServiceLevel1Code.class, ServiceLevel2Choice.class, SettlementInformation3 .class, SettlementMethod1Code.class, SimpleIdentificationInformation2 .class, StatusReason1Choice.class, StatusReasonInformation1 .class, StructuredRemittanceInformation6 .class, TransactionGroupStatus1Code.class, TransactionIndividualStatus1Code.class, TransactionRejectReason2Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:pacs.002.000.01";

    public MxPacs00200001() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxPacs00200001(final String xml) {
        this();
        MxPacs00200001 tmp = parse(xml);
        pacs00200001 = tmp.getPacs00200001();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxPacs00200001(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the pacs00200001 property.
     * 
     * @return
     *     possible object is
     *     {@link Pacs00200001 }
     *     
     */
    public Pacs00200001 getPacs00200001() {
        return pacs00200001;
    }

    /**
     * Sets the value of the pacs00200001 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pacs00200001 }
     *     
     */
    public MxPacs00200001 setPacs00200001(Pacs00200001 value) {
        this.pacs00200001 = value;
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
    public static MxPacs00200001 parse(String xml) {
        return ((MxPacs00200001) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPacs00200001 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxPacs00200001 parse(String xml, MxReadConfiguration conf) {
        return ((MxPacs00200001) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPacs00200001 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxPacs00200001 parse(String xml, MxRead parserImpl) {
        return ((MxPacs00200001) parserImpl.read(MxPacs00200001 .class, xml, _classes));
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
     * Creates an MxPacs00200001 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxPacs00200001 message
     * @return
     *     a new instance of MxPacs00200001
     */
    public final static MxPacs00200001 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxPacs00200001 .class);
    }

}
