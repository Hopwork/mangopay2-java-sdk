package com.mangopay.core.APIs;

import com.mangopay.core.FilterTransactions;
import com.mangopay.core.Pagination;
import com.mangopay.core.Sorting;
import com.mangopay.core.enumerations.CurrencyIso;
import com.mangopay.core.enumerations.KycDocumentType;
import com.mangopay.entities.*;

import java.util.List;

/**
 * Compatibility version of {@link ApiUsers}.
 * Created by thepa on 05-Jul-17.
 */
public interface LegacyUserApi {

    /**
     * Gets user.
     *
     * @param userId User identifier.
     * @return User instance returned from API, which is either of UserNatural or UserLegal type.
     * @throws Exception
     */
    User get(String userId) throws Exception;

    /**
     * Creates new user.
     *
     * @param user User object to be created.
     * @return User instance returned from API, which is either of UserNatural or UserLegal type.
     * @throws Exception
     */
    User create(User user) throws Exception;

    /**
     * Creates new user.
     *
     * @param idempotencyKey idempotency key for this request.
     * @param user           User object to be created.
     * @return User instance returned from API, which is either of UserNatural or UserLegal type.
     * @throws Exception
     */
    User create(String idempotencyKey, User user) throws Exception;

    /**
     * Gets page of users.
     *
     * @param pagination Pagination object.
     * @return Collection of User instances.
     * @throws Exception
     */
    List<User> getAll(Pagination pagination, Sorting sorting) throws Exception;

    /**
     * Gets first page of users.
     *
     * @return Collection of User instances.
     * @throws Exception
     */
    List<User> getAll() throws Exception;

    /**
     * Gets natural user by its identifier,
     *
     * @param userId UserNatural identifier.
     * @return UserNatural object returned from API.
     * @throws Exception
     */
    LegacyUserNatural getNatural(String userId) throws Exception;

    /**
     * Gets legal user by its identifier.
     *
     * @param userId UserLegal identifier.
     * @return UserLegal object returned from API.
     * @throws Exception
     */
    LegacyUserLegal getLegal(String userId) throws Exception;

    /**
     * Updates the user.
     *
     * @param user Instance of UserNatural or UserLegal class to be updated.
     * @return Updated User object returned from API.
     * @throws Exception
     */
    User update(User user) throws Exception;

    /**
     * Creates bank account for user.
     *
     * @param userId      User identifier to create bank account for.
     * @param bankAccount Bank account object.
     * @return Created bank account object returned from API.
     * @throws Exception
     */
    BankAccount createBankAccount(String userId, BankAccount bankAccount) throws Exception;

    /**
     * Creates bank account for user.
     *
     * @param idempotencyKey idempotency key for this request.
     * @param userId         User identifier to create bank account for.
     * @param bankAccount    Bank account object.
     * @return Created bank account object returned from API.
     * @throws Exception
     */
    BankAccount createBankAccount(String idempotencyKey, String userId, BankAccount bankAccount) throws Exception;

    /**
     * Updates bank account.
     *
     * @param userId        User identifier.
     * @param bankAccount   Bank account object.
     * @param bankAccountId Bank account identifier.
     * @return Updated bank account object returned from API.
     * @throws Exception
     */
    BankAccount updateBankAccount(String userId, BankAccount bankAccount, String bankAccountId) throws Exception;

    /**
     * Gets all bank accounts of user.
     *
     * @param userId     User identifier to get bank accounts of.
     * @param pagination Pagination object.
     * @param sorting    Sorting object.
     * @return Collection of bank accounts of user.
     * @throws Exception
     */
    List<BankAccount> getBankAccounts(String userId, Pagination pagination, Sorting sorting) throws Exception;

    /**
     * Gets first page of all bank accounts of user.
     *
     * @param userId User identifier to get bank accounts of.
     * @return Collection of bank accounts of user.
     * @throws Exception
     */
    List<BankAccount> getBankAccounts(String userId) throws Exception;

    /**
     * Gets bank account of user.
     *
     * @param userId        User identifier.
     * @param bankAccountId Bank account identifier.
     * @return Bank account object returned from API.
     * @throws Exception
     */
    BankAccount getBankAccount(String userId, String bankAccountId) throws Exception;

    /**
     * Gets all wallets of user.
     *
     * @param userId     User identifier to get bank accounts of.
     * @param pagination Pagination object.
     * @param sorting    Sorting object.
     * @return Collection of wallets of user.
     * @throws Exception
     */
    List<Wallet> getWallets(String userId, Pagination pagination, Sorting sorting) throws Exception;

    /**
     * Gets first page of all wallets of user.
     *
     * @param userId User identifier to get bank accounts of.
     * @return Collection of wallets of user.
     * @throws Exception
     */
    List<Wallet> getWallets(String userId) throws Exception;

    /**
     * Gets transactions for user.
     *
     * @param userId     User identifier.
     * @param pagination Pagination object.
     * @param filter     Filter object.
     * @param sorting    Sorting object.
     * @return Collection of transactions of user.
     * @throws Exception
     */
    List<Transaction> getTransactions(String userId, Pagination pagination, FilterTransactions filter, Sorting sorting) throws Exception;

    /**
     * Gets all cards for user.
     *
     * @param userId     User identifier.
     * @param pagination Pagination object.
     * @param sorting    Sorting object.
     * @return Collection of user's cards.
     * @throws Exception
     */
    List<Card> getCards(String userId, Pagination pagination, Sorting sorting) throws Exception;

    /**
     * Creates KycPage from byte array.
     *
     * @param userId        User identifier.
     * @param kycDocumentId Kyc document identifier.
     * @param binaryData    The byte array the KycPage will be created from.
     * @throws Exception
     */
    void createKycPage(String userId, String kycDocumentId, byte[] binaryData) throws Exception;

    /**
     * Creates KycPage from byte array.
     *
     * @param idempotencyKey idempotency key for this request.
     * @param userId         User identifier.
     * @param kycDocumentId  Kyc document identifier.
     * @param binaryData     The byte array the KycPage will be created from.
     * @throws Exception
     */
    void createKycPage(String idempotencyKey, String userId, String kycDocumentId, byte[] binaryData) throws Exception;

    /**
     * Creates KycPage from file.
     *
     * @param userId        User identifier.
     * @param kycDocumentId Kyc document identifier.
     * @param filePath      Path to the file the KycPage will be created from.
     * @throws Exception
     */
    void createKycPage(String userId, String kycDocumentId, String filePath) throws Exception;

    /**
     * Creates KycPage from file.
     *
     * @param idempotencyKey idempotency key for this request.
     * @param userId         User identifier.
     * @param kycDocumentId  Kyc document identifier.
     * @param filePath       Path to the file the KycPage will be created from.
     * @throws Exception
     */
    void createKycPage(String idempotencyKey, String userId, String kycDocumentId, String filePath) throws Exception;

    /**
     * Creates KycDocument.
     *
     * @param userId User identifier.
     * @param type   Type of KycDocument.
     * @return KycDocument object returned from API.
     * @throws Exception
     */
    KycDocument createKycDocument(String userId, KycDocumentType type) throws Exception;

    /**
     * Creates KycDocument.
     *
     * @param idempotencyKey idempotency key for this request.
     * @param userId         User identifier.
     * @param type           Type of KycDocument.
     * @return KycDocument object returned from API.
     * @throws Exception
     */
    KycDocument createKycDocument(String idempotencyKey, String userId, KycDocumentType type) throws Exception;

    /**
     * Gets KycDocument.
     *
     * @param userId        User identifier.
     * @param kycDocumentId KycDocument identifier.
     * @return KycDocument object returned from API.
     * @throws Exception
     */
    KycDocument getKycDocument(String userId, String kycDocumentId) throws Exception;

    /**
     * Updates KycDocument.
     *
     * @param userId      User identifier.
     * @param kycDocument KycDocument entity instance to be updated.
     * @return KycDocument object returned from API.
     * @throws Exception
     */
    KycDocument updateKycDocument(String userId, KycDocument kycDocument) throws Exception;

    /**
     * Gets all KYC documents for single user.
     *
     * @param userId     User identifier.
     * @param pagination Pagination.
     * @param sorting    Sorting object.
     * @return List of KycDocuments returned from API.
     * @throws Exception
     */
    List<KycDocument> getKycDocuments(String userId, Pagination pagination, Sorting sorting) throws Exception;

    /**
     * Shows the e-money cash-in/cash-out amounts for a particular user.
     * Result will be in <code>EUR</code> due to lack of a specified currency.
     *
     * @param userId Id of the user whose e-money data to get.
     * @return EMoney data for the specified user.
     * @throws Exception
     */
    EMoney getEMoney(String userId) throws Exception;

    /**
     * Shows the e-money cash-in/cash-out amounts for a particular user.
     * The Currency parameter can be used to have the amounts specified in a certain currency.
     *
     * @param userId Id of the user whose e-money data to get.
     * @param currencyIso Currency in which to format money amounts. If <code>null</code>, will be considered
     *                   as <code>EUR</code>.
     * @return EMoney data for the specified user.
     * @throws Exception
     */
    EMoney getEMoney(String userId, CurrencyIso currencyIso) throws Exception;

}
