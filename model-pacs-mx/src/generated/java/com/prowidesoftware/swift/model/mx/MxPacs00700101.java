
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for pacs.007.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "pacs00700101"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.007.001.01")
public class MxPacs00700101
    extends AbstractMX
{

    @XmlElement(name = "pacs.007.001.01", required = true)
    protected Pacs00700101 pacs00700101;
    public final static transient String BUSINESS_PROCESS = "pacs";
    public final static transient int FUNCTIONALITY = 7;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification3Choice.class, AddressType2Code.class, AmendmentInformationDetails1 .class, AmountType2Choice.class, BranchAndFinancialInstitutionIdentification3 .class, BranchData.class, CashAccount7 .class, CashAccountType2 .class, CashAccountType4Code.class, CashClearingSystem3Code.class, ChargeBearerType1Code.class, ChargesInformation1 .class, ClearingChannel2Code.class, ClearingSystemIdentification1Choice.class, ClearingSystemMemberIdentification3Choice.class, CreditorReferenceInformation1 .class, CreditorReferenceType1 .class, CurrencyAndAmount.class, DateAndPlaceOfBirth.class, DocumentType2Code.class, DocumentType3Code.class, EquivalentAmount.class, FinancialInstitutionIdentification3 .class, FinancialInstitutionIdentification5Choice.class, Frequency1Code.class, GenericIdentification3 .class, GenericIdentification4 .class, GroupHeader9 .class, LocalInstrument1Choice.class, MandateRelatedInformation1 .class, MxPacs00700101 .class, NameAndAddress7 .class, OrganisationIdentification2 .class, OriginalGroupInformation5 .class, OriginalTransactionReference1 .class, Pacs00700101 .class, Party2Choice.class, PartyIdentification8 .class, PaymentCategoryPurpose1Code.class, PaymentMethod4Code.class, PaymentTransactionInformation5 .class, PaymentTypeInformation6 .class, PersonIdentification3 .class, PostalAddress1 .class, Priority2Code.class, ReferredDocumentAmount1Choice.class, ReferredDocumentInformation1 .class, ReferredDocumentType1 .class, RemittanceInformation1 .class, ReversalReason1Choice.class, ReversalReasonInformation1 .class, SequenceType1Code.class, ServiceLevel1Code.class, ServiceLevel2Choice.class, SettlementInformation1 .class, SettlementInformation3 .class, SettlementMethod1Code.class, SimpleIdentificationInformation2 .class, StructuredRemittanceInformation6 .class, TransactionReversalReason1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:pacs.007.001.01";

    public MxPacs00700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxPacs00700101(final String xml) {
        this();
        MxPacs00700101 tmp = parse(xml);
        pacs00700101 = tmp.getPacs00700101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxPacs00700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the pacs00700101 property.
     * 
     * @return
     *     possible object is
     *     {@link Pacs00700101 }
     *     
     */
    public Pacs00700101 getPacs00700101() {
        return pacs00700101;
    }

    /**
     * Sets the value of the pacs00700101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pacs00700101 }
     *     
     */
    public MxPacs00700101 setPacs00700101(Pacs00700101 value) {
        this.pacs00700101 = value;
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
    public static MxPacs00700101 parse(String xml) {
        return ((MxPacs00700101) MxReadImpl.parse(MxPacs00700101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxPacs00700101 parse(String xml, MxRead parserImpl) {
        return ((MxPacs00700101) parserImpl.read(MxPacs00700101 .class, xml, _classes));
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
     * Creates an MxPacs00700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxPacs00700101 message
     * @return
     *     a new instance of MxPacs00700101
     */
    public final static MxPacs00700101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxPacs00700101 .class);
    }

}
